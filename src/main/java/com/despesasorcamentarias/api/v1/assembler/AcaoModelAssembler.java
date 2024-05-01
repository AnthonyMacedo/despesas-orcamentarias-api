package com.despesasorcamentarias.api.v1.assembler;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.despesasorcamentarias.api.v1.model.AcaoModel;
import com.despesasorcamentarias.domain.model.Acao;

@Component
public class AcaoModelAssembler {

	@Autowired
	private ModelMapper modelMapper;

	public AcaoModel toModel(Acao acao) {
		return modelMapper.map(acao, AcaoModel.class);
	}

	public List<AcaoModel> toCollectionModel(List<Acao> acoes) {
		return acoes.stream().map(acao -> toModel(acao)).collect(Collectors.toList());
	}
}
