package com.despesasorcamentarias.domain.repository;

import org.springframework.stereotype.Repository;

import com.despesasorcamentarias.domain.model.Subelemento;
import com.despesasorcamentarias.domain.repository.queries.SubelementoRepositoryQueries;

@Repository
public interface SubelementoRepository extends  CustomJpaRepository<Subelemento, Long>, SubelementoRepositoryQueries {

}
