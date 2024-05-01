package com.despesasorcamentarias.infrastructure.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

import com.despesasorcamentarias.domain.model.Unidade;
import com.despesasorcamentarias.domain.repository.UnidadeRepository;
import com.despesasorcamentarias.domain.repository.queries.UnidadeRepositoryQueries;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;

@Repository
public class UnidadeRepositoryImpl implements UnidadeRepositoryQueries {

	@PersistenceContext
	private EntityManager manager;

	@Autowired @Lazy
	private UnidadeRepository unidadeRepository;

	@Override
	public void adicionarOuAtualizar(Unidade unidade) {
		
		if (unidadeRepository.isEntidadeExistente(unidade.getId())) {
			
			Query query = manager.createQuery("update Unidade u set u.nome = :nome where u.id = :id ");
			query.setParameter("id", unidade.getId());
			query.setParameter("nome", unidade.getNome());
			query.executeUpdate();
			
		} else {
			
			Query query = manager.createQuery("insert into Unidade(id, nome) values (:id, :nome) ");
			query.setParameter("id", unidade.getId());
			query.setParameter("nome", unidade.getNome());
			query.executeUpdate();
		}
	}
	
}
