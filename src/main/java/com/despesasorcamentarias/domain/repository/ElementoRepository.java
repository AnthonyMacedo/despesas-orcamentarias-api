package com.despesasorcamentarias.domain.repository;

import org.springframework.stereotype.Repository;

import com.despesasorcamentarias.domain.model.Elemento;
import com.despesasorcamentarias.domain.repository.queries.ElementoRepositoryQueries;

@Repository
public interface ElementoRepository extends  CustomJpaRepository<Elemento, Long>, ElementoRepositoryQueries {

}
