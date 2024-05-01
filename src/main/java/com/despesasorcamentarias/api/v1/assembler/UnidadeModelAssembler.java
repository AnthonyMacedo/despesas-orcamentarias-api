package com.despesasorcamentarias.api.v1.assembler;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.despesasorcamentarias.api.v1.model.UnidadeModel;
import com.despesasorcamentarias.domain.model.Unidade;

@Component
public class UnidadeModelAssembler {

	@Autowired
	private ModelMapper modelMapper;

	public UnidadeModel toModel(Unidade unidade) {
		return modelMapper.map(unidade, UnidadeModel.class);
	}

	public List<UnidadeModel> toCollectionModel(List<Unidade> unidades) {
		return unidades.stream().map(unidade -> toModel(unidade)).collect(Collectors.toList());
	}
}
