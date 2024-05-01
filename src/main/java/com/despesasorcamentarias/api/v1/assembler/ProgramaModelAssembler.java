package com.despesasorcamentarias.api.v1.assembler;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.despesasorcamentarias.api.v1.model.ProgramaModel;
import com.despesasorcamentarias.domain.model.Programa;

@Component
public class ProgramaModelAssembler {

	@Autowired
	private ModelMapper modelMapper;

	public ProgramaModel toModel(Programa programa) {
		return modelMapper.map(programa, ProgramaModel.class);
	}

	public List<ProgramaModel> toCollectionModel(List<Programa> programas) {
		return programas.stream().map(programa -> toModel(programa)).collect(Collectors.toList());
	}
}
