package com.despesasorcamentarias.domain.repository;

import org.springframework.stereotype.Repository;

import com.despesasorcamentarias.domain.model.GrupoDespesa;
import com.despesasorcamentarias.domain.repository.queries.GrupoDespesaRepositoryQueries;

@Repository
public interface GrupoDespesaRepository extends  CustomJpaRepository<GrupoDespesa, Long>, GrupoDespesaRepositoryQueries {

}
