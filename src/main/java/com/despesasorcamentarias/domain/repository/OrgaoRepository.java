package com.despesasorcamentarias.domain.repository;

import org.springframework.stereotype.Repository;

import com.despesasorcamentarias.domain.model.Orgao;
import com.despesasorcamentarias.domain.repository.queries.OrgaoRepositoryQueries;

@Repository
public interface OrgaoRepository extends  CustomJpaRepository<Orgao, Long>, OrgaoRepositoryQueries {


}
