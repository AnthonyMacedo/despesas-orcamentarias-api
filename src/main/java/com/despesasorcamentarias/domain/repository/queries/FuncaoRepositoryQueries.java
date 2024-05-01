package com.despesasorcamentarias.domain.repository.queries;

import org.springframework.stereotype.Repository;

import com.despesasorcamentarias.domain.model.Funcao;

@Repository
public interface FuncaoRepositoryQueries {

	void adicionarOuAtualizar(Funcao funcao);
	
}
