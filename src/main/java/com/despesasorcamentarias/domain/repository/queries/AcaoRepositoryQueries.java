package com.despesasorcamentarias.domain.repository.queries;

import org.springframework.stereotype.Repository;

import com.despesasorcamentarias.domain.model.Acao;

@Repository
public interface AcaoRepositoryQueries {

	void adicionarOuAtualizar(Acao acao);
	
}
