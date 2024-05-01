package com.despesasorcamentarias.api.v1.assembler;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.despesasorcamentarias.api.v1.model.FuncaoModel;
import com.despesasorcamentarias.domain.model.Funcao;

@Component
public class FuncaoModelAssembler {

	@Autowired
	private ModelMapper modelMapper;

	public FuncaoModel toModel(Funcao funcao) {
		return modelMapper.map(funcao, FuncaoModel.class);
	}

	public List<FuncaoModel> toCollectionModel(List<Funcao> funcoes) {
		return funcoes.stream().map(funcao -> toModel(funcao)).collect(Collectors.toList());
	}
}
