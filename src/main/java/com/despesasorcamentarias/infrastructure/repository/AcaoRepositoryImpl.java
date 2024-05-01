package com.despesasorcamentarias.infrastructure.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

import com.despesasorcamentarias.domain.model.Acao;
import com.despesasorcamentarias.domain.repository.AcaoRepository;
import com.despesasorcamentarias.domain.repository.queries.AcaoRepositoryQueries;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;

@Repository
public class AcaoRepositoryImpl implements AcaoRepositoryQueries {

	@PersistenceContext
	private EntityManager manager;

	@Autowired @Lazy
	private AcaoRepository acaoRepository;

	@Override
	public void adicionarOuAtualizar(Acao acao) {
		
		if (acaoRepository.isEntidadeExistente(acao.getId())) {
			
			Query query = manager.createQuery("update Acao a set a.nome = :nome where a.id = :id ");
			query.setParameter("id", acao.getId());
			query.setParameter("nome", acao.getNome());
			query.executeUpdate();
			
		} else {
			Query query = manager.createQuery("insert into Acao(id, nome) values (:id, :nome) ");
			query.setParameter("id", acao.getId());
			query.setParameter("nome", acao.getNome());
			query.executeUpdate();
		}
	}
	
}
