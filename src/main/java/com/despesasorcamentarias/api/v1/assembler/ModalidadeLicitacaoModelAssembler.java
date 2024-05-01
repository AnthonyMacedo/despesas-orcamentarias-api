package com.despesasorcamentarias.api.v1.assembler;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.despesasorcamentarias.api.v1.model.ModalidadeLicitacaoModel;
import com.despesasorcamentarias.domain.model.ModalidadeLicitacao;

@Component
public class ModalidadeLicitacaoModelAssembler {

	@Autowired
	private ModelMapper modelMapper;

	public ModalidadeLicitacaoModel toModel(ModalidadeLicitacao modalidadeLicitacao) {
		return modelMapper.map(modalidadeLicitacao, ModalidadeLicitacaoModel.class);
	}

	public List<ModalidadeLicitacaoModel> toCollectionModel(List<ModalidadeLicitacao> modalidadesLicitacoes) {
		return modalidadesLicitacoes.stream().map(modalidadeLicitacao -> toModel(modalidadeLicitacao)).collect(Collectors.toList());
	}
}
