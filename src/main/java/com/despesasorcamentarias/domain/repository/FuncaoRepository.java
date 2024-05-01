package com.despesasorcamentarias.domain.repository;

import org.springframework.stereotype.Repository;

import com.despesasorcamentarias.domain.model.Funcao;
import com.despesasorcamentarias.domain.repository.queries.FuncaoRepositoryQueries;

@Repository
public interface FuncaoRepository extends  CustomJpaRepository<Funcao, Long>, FuncaoRepositoryQueries {

}
