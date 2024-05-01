package com.despesasorcamentarias.api.v1.assembler;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.despesasorcamentarias.api.v1.model.ElementoModel;
import com.despesasorcamentarias.domain.model.Elemento;

@Component
public class ElementoModelAssembler {

	@Autowired
	private ModelMapper modelMapper;

	public ElementoModel toModel(Elemento elemento) {
		return modelMapper.map(elemento, ElementoModel.class);
	}

	public List<ElementoModel> toCollectionModel(List<Elemento> elementos) {
		return elementos.stream().map(elemento -> toModel(elemento)).collect(Collectors.toList());
	}
}
