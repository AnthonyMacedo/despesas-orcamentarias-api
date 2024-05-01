package com.despesasorcamentarias.domain.repository.queries;

import org.springframework.stereotype.Repository;

import com.despesasorcamentarias.domain.model.Programa;

@Repository
public interface ProgramaRepositoryQueries {

	void adicionarOuAtualizar(Programa programa);
	
}
