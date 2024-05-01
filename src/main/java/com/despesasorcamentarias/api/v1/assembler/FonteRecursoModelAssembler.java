package com.despesasorcamentarias.api.v1.assembler;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.despesasorcamentarias.api.v1.model.FonteRecursoModel;
import com.despesasorcamentarias.domain.model.FonteRecurso;

@Component
public class FonteRecursoModelAssembler {

	@Autowired
	private ModelMapper modelMapper;

	public FonteRecursoModel toModel(FonteRecurso fonteRecurso) {
		return modelMapper.map(fonteRecurso, FonteRecursoModel.class);
	}

	public List<FonteRecursoModel> toCollectionModel(List<FonteRecurso> fonteRecursos) {
		return fonteRecursos.stream().map(fonteRecurso -> toModel(fonteRecurso)).collect(Collectors.toList());
	}
}
