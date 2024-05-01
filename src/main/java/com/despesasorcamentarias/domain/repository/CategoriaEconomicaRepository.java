package com.despesasorcamentarias.domain.repository;

import org.springframework.stereotype.Repository;

import com.despesasorcamentarias.domain.model.CategoriaEconomica;
import com.despesasorcamentarias.domain.repository.queries.CategoriaEconomicaQueries;

@Repository
public interface CategoriaEconomicaRepository extends  CustomJpaRepository<CategoriaEconomica, Long>, CategoriaEconomicaQueries {

}
