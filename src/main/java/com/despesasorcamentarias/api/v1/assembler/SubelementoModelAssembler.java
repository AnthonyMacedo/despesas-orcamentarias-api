package com.despesasorcamentarias.api.v1.assembler;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.despesasorcamentarias.api.v1.model.SubelementoModel;
import com.despesasorcamentarias.domain.model.Subelemento;

@Component
public class SubelementoModelAssembler {

	@Autowired
	private ModelMapper modelMapper;

	public SubelementoModel toModel(Subelemento subelemento) {
		return modelMapper.map(subelemento, SubelementoModel.class);
	}

	public List<SubelementoModel> toCollectionModel(List<Subelemento> subelementos) {
		return subelementos.stream().map(subelemento -> toModel(subelemento)).collect(Collectors.toList());
	}
}
