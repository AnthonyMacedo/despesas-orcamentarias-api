package com.despesasorcamentarias.domain.repository.queries;

import org.springframework.stereotype.Repository;

import com.despesasorcamentarias.domain.model.GrupoDespesa;

@Repository
public interface GrupoDespesaRepositoryQueries {

	void adicionarOuAtualizar(GrupoDespesa grupoDespesa);
	
}
