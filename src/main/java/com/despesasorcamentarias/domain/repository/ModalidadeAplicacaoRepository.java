package com.despesasorcamentarias.domain.repository;

import org.springframework.stereotype.Repository;

import com.despesasorcamentarias.domain.model.ModalidadeAplicacao;
import com.despesasorcamentarias.domain.repository.queries.ModalidadeAplicacaoRepositoryQueries;

@Repository
public interface ModalidadeAplicacaoRepository extends  CustomJpaRepository<ModalidadeAplicacao, Long>, ModalidadeAplicacaoRepositoryQueries {

}
