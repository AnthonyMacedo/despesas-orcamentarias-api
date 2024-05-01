package com.despesasorcamentarias.domain.repository.queries;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import com.despesasorcamentarias.domain.model.DespesaOrcamentaria;

@Repository
public interface DespesaOrcamentariaRepositoryQueries {

	Page<DespesaOrcamentaria> buscarTodos(Pageable pageable);
	
}
