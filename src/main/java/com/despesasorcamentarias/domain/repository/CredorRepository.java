package com.despesasorcamentarias.domain.repository;

import org.springframework.stereotype.Repository;

import com.despesasorcamentarias.domain.model.Credor;
import com.despesasorcamentarias.domain.repository.queries.CredorRepositoryQueries;

@Repository
public interface CredorRepository extends  CustomJpaRepository<Credor, Long>, CredorRepositoryQueries {

}
