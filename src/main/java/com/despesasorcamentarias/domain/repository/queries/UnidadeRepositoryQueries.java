package com.despesasorcamentarias.domain.repository.queries;

import org.springframework.stereotype.Repository;

import com.despesasorcamentarias.domain.model.Unidade;

@Repository
public interface UnidadeRepositoryQueries {

	void adicionarOuAtualizar(Unidade unidade);
	
}
