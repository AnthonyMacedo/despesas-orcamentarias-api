package com.despesasorcamentarias.infrastructure.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

import com.despesasorcamentarias.domain.model.Funcao;
import com.despesasorcamentarias.domain.repository.FuncaoRepository;
import com.despesasorcamentarias.domain.repository.queries.FuncaoRepositoryQueries;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;

@Repository
public class FuncaoRepositoryImpl implements FuncaoRepositoryQueries {

	@PersistenceContext
	private EntityManager manager;

	@Autowired @Lazy
	private FuncaoRepository funcaoRepository;

	@Override
	public void adicionarOuAtualizar(Funcao funcao) {
		
		if (funcaoRepository.isEntidadeExistente(funcao.getId())) {
			
			Query query = manager.createQuery("update Funcao a set a.nome = :nome where a.id = :id ");
			query.setParameter("id", funcao.getId());
			query.setParameter("nome", funcao.getNome());
			query.executeUpdate();
			
		} else {
			Query query = manager.createQuery("insert into Funcao(id, nome) values (:id, :nome) ");
			query.setParameter("id", funcao.getId());
			query.setParameter("nome", funcao.getNome());
			query.executeUpdate();
		}
	}
	
}
