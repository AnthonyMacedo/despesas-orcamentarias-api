package com.despesasorcamentarias.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.despesasorcamentarias.domain.model.Acao;
import com.despesasorcamentarias.domain.repository.AcaoRepository;

import jakarta.transaction.Transactional;

@Service
public class AcaoService {

	@Autowired
	private AcaoRepository acaoRepository;

	public boolean isInexistente(Acao acao) {
		return !acaoRepository.existsById(acao.getId());
	}

	@Transactional
	public void adicionarOuAtualizar(Acao acao) {
		acaoRepository.adicionarOuAtualizar(acao);
	}

}
