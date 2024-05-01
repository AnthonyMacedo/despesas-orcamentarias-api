package com.despesasorcamentarias.domain.repository.queries;

import org.springframework.stereotype.Repository;

import com.despesasorcamentarias.domain.model.Elemento;

@Repository
public interface ElementoRepositoryQueries {

	void adicionarOuAtualizar(Elemento elemento);
	
}
