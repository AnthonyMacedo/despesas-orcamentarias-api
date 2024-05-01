package com.despesasorcamentarias.domain.repository.queries;

import org.springframework.stereotype.Repository;

import com.despesasorcamentarias.domain.model.Subelemento;

@Repository
public interface SubelementoRepositoryQueries {

	void adicionarOuAtualizar(Subelemento subelemento);
	
}
