package com.despesasorcamentarias.infrastructure.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

import com.despesasorcamentarias.domain.model.Subfuncao;
import com.despesasorcamentarias.domain.repository.SubfuncaoRepository;
import com.despesasorcamentarias.domain.repository.queries.SubfuncaoRepositoryQueries;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;

@Repository
public class SubfuncaoRepositoryImpl implements SubfuncaoRepositoryQueries {

	@PersistenceContext
	private EntityManager manager;

	@Autowired @Lazy
	private SubfuncaoRepository subfuncaoRepository;

	@Override
	public void adicionarOuAtualizar(Subfuncao subfuncao) {
		
		if (subfuncaoRepository.isEntidadeExistente(subfuncao.getId())) {
			
			Query query = manager.createQuery("update Subfuncao a set a.nome = :nome where a.id = :id ");
			query.setParameter("id", subfuncao.getId());
			query.setParameter("nome", subfuncao.getNome());
			query.executeUpdate();
			
		} else {
			Query query = manager.createQuery("insert into Subfuncao(id, nome) values (:id, :nome) ");
			query.setParameter("id", subfuncao.getId());
			query.setParameter("nome", subfuncao.getNome());
			query.executeUpdate();
		}
	}
	
}
