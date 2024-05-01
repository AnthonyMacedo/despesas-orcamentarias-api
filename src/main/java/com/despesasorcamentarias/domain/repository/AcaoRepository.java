package com.despesasorcamentarias.domain.repository;

import org.springframework.stereotype.Repository;

import com.despesasorcamentarias.domain.model.Acao;
import com.despesasorcamentarias.domain.repository.queries.AcaoRepositoryQueries;

@Repository
public interface AcaoRepository extends  CustomJpaRepository<Acao, Long>, AcaoRepositoryQueries {

}
