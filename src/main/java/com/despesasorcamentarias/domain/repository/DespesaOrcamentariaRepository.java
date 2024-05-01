package com.despesasorcamentarias.domain.repository;

import org.springframework.stereotype.Repository;

import com.despesasorcamentarias.domain.model.DespesaOrcamentaria;
import com.despesasorcamentarias.domain.repository.queries.DespesaOrcamentariaRepositoryQueries;

@Repository
public interface DespesaOrcamentariaRepository extends  CustomJpaRepository<DespesaOrcamentaria, Long>, DespesaOrcamentariaRepositoryQueries {

}
