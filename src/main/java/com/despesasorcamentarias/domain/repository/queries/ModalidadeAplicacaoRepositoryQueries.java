package com.despesasorcamentarias.domain.repository.queries;

import org.springframework.stereotype.Repository;

import com.despesasorcamentarias.domain.model.ModalidadeAplicacao;

@Repository
public interface ModalidadeAplicacaoRepositoryQueries {

	void adicionarOuAtualizar(ModalidadeAplicacao modalidadeAplicacao);
	
}
