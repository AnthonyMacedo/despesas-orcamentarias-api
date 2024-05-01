package com.despesasorcamentarias.api.v1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.despesasorcamentarias.api.v1.assembler.DespesaOrcamentariaModelAssembler;
import com.despesasorcamentarias.api.v1.assembler.disassembler.DespesaOrcamentariaInputDisassembler;
import com.despesasorcamentarias.api.v1.model.DespesaOrcamentariaModel;
import com.despesasorcamentarias.api.v1.model.input.DespesaOrcamentariaInput;
import com.despesasorcamentarias.api.v1.openapi.DespesaOrcamentariaControllerOpenApi;
import com.despesasorcamentarias.domain.model.DespesaOrcamentaria;
import com.despesasorcamentarias.domain.service.DespesasOrcamentariasService;

import jakarta.validation.Valid;

@RestController
@RequestMapping(value = "/v1/despesas-orcamentarias", produces = MediaType.APPLICATION_JSON_VALUE)
public class DespesaOrcamentariaController implements DespesaOrcamentariaControllerOpenApi {

	@Autowired
	private DespesasOrcamentariasService despesasOrcamentariasService;

	@Autowired
	private DespesaOrcamentariaModelAssembler despesaOrcamentariaAssembler;
	
	@Autowired
	private DespesaOrcamentariaInputDisassembler despesaOrcamentariaDisassembler;

	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public DespesaOrcamentariaModel adicionar(@RequestBody DespesaOrcamentariaInput despesaOrcamentariaInput) {
		
		DespesaOrcamentaria despesaOrcamentaria = despesaOrcamentariaDisassembler.toDomainObject(despesaOrcamentariaInput);
		
		return despesaOrcamentariaAssembler.toModel(despesasOrcamentariasService.salvar(despesaOrcamentaria)); 
	}
	
	@GetMapping
	public Page<DespesaOrcamentariaModel> buscarTodos(Pageable pageable) {
		return despesaOrcamentariaAssembler.toCollectionModel(despesasOrcamentariasService.buscarTodos(pageable));
	}
	
	@DeleteMapping("/{despesaOrcamentariaId}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void remover(@PathVariable("despesaOrcamentariaId") Long despesaOrcamentariaId) {
		despesasOrcamentariasService.remover(despesaOrcamentariaId);
	}

	@PutMapping("/{despesaOrcamentariaId}")
	public DespesaOrcamentariaModel atualizar(@PathVariable Long despesaOrcamentariaId, @RequestBody @Valid DespesaOrcamentariaInput despesaOrcamentariaInput) {
		
		DespesaOrcamentaria despesaOrcamentariaAtual = despesasOrcamentariasService.porId(despesaOrcamentariaId);
		
		despesaOrcamentariaDisassembler.copyToDomainObject(despesaOrcamentariaInput, despesaOrcamentariaAtual);
		despesaOrcamentariaAtual = despesasOrcamentariasService.salvar(despesaOrcamentariaAtual);
		
		return despesaOrcamentariaAssembler.toModel(despesaOrcamentariaAtual);
	}
	
}
