package com.despesasorcamentarias.domain.repository.queries;

import org.springframework.stereotype.Repository;

import com.despesasorcamentarias.domain.model.Orgao;

@Repository
public interface OrgaoRepositoryQueries {

	void adicionarOuAtualizar(Orgao orgao);
	
}
