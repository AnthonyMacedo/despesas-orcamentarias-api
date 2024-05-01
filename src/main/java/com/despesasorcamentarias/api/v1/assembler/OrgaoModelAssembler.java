package com.despesasorcamentarias.api.v1.assembler;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.despesasorcamentarias.api.v1.model.OrgaoModel;
import com.despesasorcamentarias.domain.model.Orgao;

@Component
public class OrgaoModelAssembler {

	@Autowired
	private ModelMapper modelMapper;

	public OrgaoModel toModel(Orgao orgao) {
		return modelMapper.map(orgao, OrgaoModel.class);
	}

	public List<OrgaoModel> toCollectionModel(List<Orgao> orgaos) {
		return orgaos.stream().map(orgao -> toModel(orgao)).collect(Collectors.toList());
	}
}
