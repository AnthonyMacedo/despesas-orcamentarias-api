package com.despesasorcamentarias.api.v1.assembler;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.despesasorcamentarias.api.v1.model.CredorModel;
import com.despesasorcamentarias.domain.model.Credor;

@Component
public class CredorModelAssembler {

	@Autowired
	private ModelMapper modelMapper;

	public CredorModel toModel(Credor credor) {
		return modelMapper.map(credor, CredorModel.class);
	}

	public List<CredorModel> toCollectionModel(List<Credor> credores) {
		return credores.stream().map(credor -> toModel(credor)).collect(Collectors.toList());
	}
}
