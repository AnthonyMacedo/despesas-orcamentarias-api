package com.despesasorcamentarias.api.v1.assembler;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.despesasorcamentarias.api.v1.model.SubfuncaoModel;
import com.despesasorcamentarias.domain.model.Subfuncao;

@Component
public class SubfuncaoModelAssembler {

	@Autowired
	private ModelMapper modelMapper;

	public SubfuncaoModel toModel(Subfuncao subfuncao) {
		return modelMapper.map(subfuncao, SubfuncaoModel.class);
	}

	public List<SubfuncaoModel> toCollectionModel(List<Subfuncao> subfuncoes) {
		return subfuncoes.stream().map(subfuncao -> toModel(subfuncao)).collect(Collectors.toList());
	}
}
