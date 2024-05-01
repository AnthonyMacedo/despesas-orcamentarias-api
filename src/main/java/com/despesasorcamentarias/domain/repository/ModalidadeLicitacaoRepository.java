package com.despesasorcamentarias.domain.repository;

import org.springframework.stereotype.Repository;

import com.despesasorcamentarias.domain.model.ModalidadeLicitacao;
import com.despesasorcamentarias.domain.repository.queries.ModalidadeLicitacaoRepositoryQueries;

@Repository
public interface ModalidadeLicitacaoRepository extends  CustomJpaRepository<ModalidadeLicitacao, Long>, ModalidadeLicitacaoRepositoryQueries {

}
