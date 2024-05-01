package com.despesasorcamentarias.domain.repository;

import org.springframework.stereotype.Repository;

import com.despesasorcamentarias.domain.model.Unidade;
import com.despesasorcamentarias.domain.repository.queries.UnidadeRepositoryQueries;

@Repository
public interface UnidadeRepository extends  CustomJpaRepository<Unidade, Long>, UnidadeRepositoryQueries {

}
