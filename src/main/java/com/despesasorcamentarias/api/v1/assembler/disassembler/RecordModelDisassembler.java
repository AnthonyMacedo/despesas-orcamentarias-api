package com.despesasorcamentarias.api.v1.assembler.disassembler;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.despesasorcamentarias.api.v1.model.RecordModel;
import com.despesasorcamentarias.domain.model.DespesaOrcamentaria;


@Component
public class RecordModelDisassembler {

	@Autowired
	private ModelMapper modelMapper;

	public DespesaOrcamentaria toObject(RecordModel despesaResource) {
		modelMapper.getConfiguration()
		.setAmbiguityIgnored(true);
		
		return modelMapper.map(despesaResource, DespesaOrcamentaria.class);
	}
	
	public List<DespesaOrcamentaria> toCollectionObject(List<RecordModel> list) {
		return list.stream().map(despesa -> toObject(despesa)).collect(Collectors.toList());
	}
	
}
