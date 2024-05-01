package com.despesasorcamentarias.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.despesasorcamentarias.domain.model.CategoriaEconomica;
import com.despesasorcamentarias.domain.repository.CategoriaEconomicaRepository;

import jakarta.transaction.Transactional;

@Service
public class CategoriaEconomicaService {

	@Autowired
	private CategoriaEconomicaRepository categoriaEconomicaRepository;

	@Transactional
	public void adicionarOuAtualizar(CategoriaEconomica categoriaEconomica) {
		categoriaEconomicaRepository.adicionarOuAtualizar(categoriaEconomica);
	}

}
