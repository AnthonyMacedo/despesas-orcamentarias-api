package com.despesasorcamentarias.domain.repository.queries;

import org.springframework.stereotype.Repository;

import com.despesasorcamentarias.domain.model.Subfuncao;

@Repository
public interface SubfuncaoRepositoryQueries {

	void adicionarOuAtualizar(Subfuncao subfuncao);
	
}
