package com.despesasorcamentarias.infrastructure.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

import com.despesasorcamentarias.domain.model.ModalidadeAplicacao;
import com.despesasorcamentarias.domain.repository.ModalidadeAplicacaoRepository;
import com.despesasorcamentarias.domain.repository.queries.ModalidadeAplicacaoRepositoryQueries;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;

@Repository
public class ModalidadeAplicacaoRepositoryImpl implements ModalidadeAplicacaoRepositoryQueries {

	@PersistenceContext
	private EntityManager manager;

	@Autowired @Lazy
	private ModalidadeAplicacaoRepository modalidadeAplicacaoRepository;

	@Override
	public void adicionarOuAtualizar(ModalidadeAplicacao modalidadeAplicacao) {
		
		if (modalidadeAplicacaoRepository.isEntidadeExistente(modalidadeAplicacao.getId())) {
			
			Query query = manager.createQuery("update ModalidadeAplicacao a set a.nome = :nome where a.id = :id ");
			query.setParameter("id", modalidadeAplicacao.getId());
			query.setParameter("nome", modalidadeAplicacao.getNome());
			query.executeUpdate();
			
		} else {
			Query query = manager.createQuery("insert into ModalidadeAplicacao(id, nome) values (:id, :nome) ");
			query.setParameter("id", modalidadeAplicacao.getId());
			query.setParameter("nome", modalidadeAplicacao.getNome());
			query.executeUpdate();
		}
	}
	
}
