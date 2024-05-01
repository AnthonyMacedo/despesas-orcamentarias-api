package com.despesasorcamentarias.domain.repository;

import org.springframework.stereotype.Repository;

import com.despesasorcamentarias.domain.model.Subfuncao;
import com.despesasorcamentarias.domain.repository.queries.SubfuncaoRepositoryQueries;

@Repository
public interface SubfuncaoRepository extends  CustomJpaRepository<Subfuncao, Long>, SubfuncaoRepositoryQueries {

}
