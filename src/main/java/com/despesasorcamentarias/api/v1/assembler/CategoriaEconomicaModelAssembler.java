package com.despesasorcamentarias.api.v1.assembler;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.despesasorcamentarias.api.v1.model.CategoriaEconomicaModel;
import com.despesasorcamentarias.domain.model.CategoriaEconomica;

@Component
public class CategoriaEconomicaModelAssembler {

	@Autowired
	private ModelMapper modelMapper;

	public CategoriaEconomicaModel toModel(CategoriaEconomica categoriaEconomica) {
		return modelMapper.map(categoriaEconomica, CategoriaEconomicaModel.class);
	}

	public List<CategoriaEconomicaModel> toCollectionModel(List<CategoriaEconomica> catagorias) {
		return catagorias.stream().map(categoriaEconomica -> toModel(categoriaEconomica)).collect(Collectors.toList());
	}
}
