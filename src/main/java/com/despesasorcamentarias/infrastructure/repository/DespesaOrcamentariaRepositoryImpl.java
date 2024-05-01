package com.despesasorcamentarias.infrastructure.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import com.despesasorcamentarias.domain.model.DespesaOrcamentaria;
import com.despesasorcamentarias.domain.repository.DespesaOrcamentariaRepository;
import com.despesasorcamentarias.domain.repository.queries.DespesaOrcamentariaRepositoryQueries;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;

@Repository
public class DespesaOrcamentariaRepositoryImpl implements DespesaOrcamentariaRepositoryQueries {

	@PersistenceContext
	private EntityManager manager;

	@Autowired
	@Lazy
	private DespesaOrcamentariaRepository despesaOrcamentariaRepository;

	public Page<DespesaOrcamentaria> buscarTodos(Pageable pageable) {
		TypedQuery<DespesaOrcamentaria> query = manager.createQuery("from DespesaOrcamentaria ", DespesaOrcamentaria.class);
		adicionarRestricoesDePaginacao(query, pageable);
		return new PageImpl<>(query.getResultList());
	}

	private void adicionarRestricoesDePaginacao(TypedQuery<?> query, Pageable pageable) {
		int paginaAtual = pageable.getPageNumber();
		int totalRegistrosPorPagina = pageable.getPageSize();
		int primeiroRegistroDaPagina = paginaAtual * totalRegistrosPorPagina;

		query.setFirstResult(primeiroRegistroDaPagina);
		query.setMaxResults(totalRegistrosPorPagina);
	}
}
