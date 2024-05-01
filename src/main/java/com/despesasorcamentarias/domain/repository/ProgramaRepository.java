package com.despesasorcamentarias.domain.repository;

import org.springframework.stereotype.Repository;

import com.despesasorcamentarias.domain.model.Programa;
import com.despesasorcamentarias.domain.repository.queries.ProgramaRepositoryQueries;

@Repository
public interface ProgramaRepository extends  CustomJpaRepository<Programa, Long>, ProgramaRepositoryQueries {

}
