package com.despesasorcamentarias.domain.repository.queries;

import org.springframework.stereotype.Repository;

import com.despesasorcamentarias.domain.model.ModalidadeLicitacao;

@Repository
public interface ModalidadeLicitacaoRepositoryQueries {

	void adicionarOuAtualizar(ModalidadeLicitacao modalidadeLicitacao);

}
