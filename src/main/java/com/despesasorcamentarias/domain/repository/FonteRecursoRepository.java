package com.despesasorcamentarias.domain.repository;

import org.springframework.stereotype.Repository;

import com.despesasorcamentarias.domain.model.FonteRecurso;
import com.despesasorcamentarias.domain.repository.queries.FonteRecursoRepositoryQueries;

@Repository
public interface FonteRecursoRepository extends  CustomJpaRepository<FonteRecurso, Long>, FonteRecursoRepositoryQueries {

}
