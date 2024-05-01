package com.despesasorcamentarias.api.v1.assembler;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.despesasorcamentarias.api.v1.model.GrupoDespesaModel;
import com.despesasorcamentarias.domain.model.GrupoDespesa;

@Component
public class GrupoDepesaModelAssembler {

	@Autowired
	private ModelMapper modelMapper;

	public GrupoDespesaModel toModel(GrupoDespesa grupoDespesa) {
		return modelMapper.map(grupoDespesa, GrupoDespesaModel.class);
	}

	public List<GrupoDespesaModel> toCollectionModel(List<GrupoDespesa> gruposDespesas) {
		return gruposDespesas.stream().map(grupoDespesa -> toModel(grupoDespesa)).collect(Collectors.toList());
	}
}
