package com.despesasorcamentarias.api.v1.assembler;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.despesasorcamentarias.api.v1.model.ModalidadeAplicacaoModel;
import com.despesasorcamentarias.domain.model.ModalidadeAplicacao;

@Component
public class ModalidadeAplicacaoModelAssembler {

	@Autowired
	private ModelMapper modelMapper;

	public ModalidadeAplicacaoModel toModel(ModalidadeAplicacao modalidadeAplicacao) {
		return modelMapper.map(modalidadeAplicacao, ModalidadeAplicacaoModel.class);
	}

	public List<ModalidadeAplicacaoModel> toCollectionModel(List<ModalidadeAplicacao> modalidadesAplicacao) {
		return modalidadesAplicacao.stream().map(modalidadeAplicacao -> toModel(modalidadeAplicacao)).collect(Collectors.toList());
	}
}
