package com.despesasorcamentarias.infrastructure.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

import com.despesasorcamentarias.domain.model.ModalidadeLicitacao;
import com.despesasorcamentarias.domain.repository.ModalidadeLicitacaoRepository;
import com.despesasorcamentarias.domain.repository.queries.ModalidadeLicitacaoRepositoryQueries;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;

@Repository
public class ModalidadeLicitacaoRepositoryImpl implements ModalidadeLicitacaoRepositoryQueries {

	@PersistenceContext
	private EntityManager manager;

	@Autowired @Lazy
	private ModalidadeLicitacaoRepository modalidadeLicitacaoRepository;

	@Override
	public void adicionarOuAtualizar(ModalidadeLicitacao modalidadeLicitacao) {
		
		if (modalidadeLicitacaoRepository.isEntidadeExistente(modalidadeLicitacao.getId())) {
			
			Query query = manager.createQuery("update ModalidadeLicitacao a set a.nome = :nome where a.id = :id ");
			query.setParameter("id", modalidadeLicitacao.getId());
			query.setParameter("nome", modalidadeLicitacao.getNome());
			query.executeUpdate();
			
		} else {
			Query query = manager.createQuery("insert into ModalidadeLicitacao(id, nome) values (:id, :nome) ");
			query.setParameter("id", modalidadeLicitacao.getId());
			query.setParameter("nome", modalidadeLicitacao.getNome());
			query.executeUpdate();
		}
	}
	
}
