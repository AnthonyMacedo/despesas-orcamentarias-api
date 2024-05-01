package com.despesasorcamentarias.api.v1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.server.ResponseStatusException;

import com.despesasorcamentarias.api.v1.assembler.disassembler.RecordModelDisassembler;
import com.despesasorcamentarias.api.v1.model.DataStoreModel;
import com.despesasorcamentarias.api.v1.openapi.ServiceConsumerControllerOpenApi;
import com.despesasorcamentarias.domain.model.DespesaOrcamentaria;
import com.despesasorcamentarias.domain.service.DespesasOrcamentariasService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
@RequestMapping(value = "/v1/serviceconsumer", produces = MediaType.APPLICATION_JSON_VALUE)
public class ServiceConsumerController implements ServiceConsumerControllerOpenApi {

	@Autowired
	private DespesasOrcamentariasService despesasOrcamentariasService;

	@Autowired
	private RecordModelDisassembler recordModelDisassembler;

	@ResponseStatus(HttpStatus.CREATED)
	@GetMapping("/despesas-orcamentarias-recife")
	public void obterDespesasOrcamentariasRecifeEPersistirNaBaseDeDados() {

		try {
			RestTemplate restTemplate = new RestTemplate();

			String url = "http://dados.recife.pe.gov.br/api/3/action/datastore_search?resource_id=d4d8a7f0-d4be-4397-b950-f0c991438111&limit=100";

			String responseJson = restTemplate.getForObject(url, String.class);

			ObjectMapper objectMapper = new ObjectMapper()
					.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);

			DataStoreModel dataStoreModel = objectMapper.readValue(responseJson, DataStoreModel.class);

			List<DespesaOrcamentaria> despesas = recordModelDisassembler.toCollectionObject(dataStoreModel.getResult().get(0).getRecords());

			despesasOrcamentariasService.registrarTodas(despesas);

		} catch (JsonMappingException e) {
			e.printStackTrace();
			throw new ResponseStatusException(HttpStatus.BAD_GATEWAY);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
			throw new ResponseStatusException(HttpStatus.BAD_GATEWAY);
		}
	}

}
