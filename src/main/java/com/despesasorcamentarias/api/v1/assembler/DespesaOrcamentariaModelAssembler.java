package com.despesasorcamentarias.api.v1.assembler;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.stereotype.Component;

import com.despesasorcamentarias.api.v1.model.DespesaOrcamentariaModel;
import com.despesasorcamentarias.domain.model.DespesaOrcamentaria;

@Component
public class DespesaOrcamentariaModelAssembler {

	@Autowired
	private ModelMapper modelMapper;

	public DespesaOrcamentariaModel toModel(DespesaOrcamentaria despesa) {
		return modelMapper.map(despesa, DespesaOrcamentariaModel.class);
	}

	public List<DespesaOrcamentariaModel> toCollectionModel(List<DespesaOrcamentaria> despesas) {
		return despesas.stream().map(despesa -> toModel(despesa)).collect(Collectors.toList());
	}
	
	public Page<DespesaOrcamentariaModel> toCollectionModel(Page<DespesaOrcamentaria> despesas) {
		return new PageImpl<>(despesas.stream().map(despesa -> toModel(despesa)).collect(Collectors.toList()));
	}
}
