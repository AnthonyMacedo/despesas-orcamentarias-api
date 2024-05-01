package com.despesasorcamentarias.domain.repository.queries;

import org.springframework.stereotype.Repository;

import com.despesasorcamentarias.domain.model.FonteRecurso;

@Repository
public interface FonteRecursoRepositoryQueries {

	void adicionarOuAtualizar(FonteRecurso fonteRecurso);
	
}
