package com.despesasorcamentarias.infrastructure.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

import com.despesasorcamentarias.domain.model.Credor;
import com.despesasorcamentarias.domain.repository.CredorRepository;
import com.despesasorcamentarias.domain.repository.queries.CredorRepositoryQueries;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;

@Repository
public class CredorRepositoryImpl implements CredorRepositoryQueries {

	@PersistenceContext
	private EntityManager manager;

	@Autowired @Lazy
	private CredorRepository credorRepository;

	@Override
	public void adicionarOuAtualizar(Credor credor) {
		
		if (credorRepository.isEntidadeExistente(credor.getId())) {
			
			Query query = manager.createQuery("update Credor a set a.nome = :nome where a.id = :id ");
			query.setParameter("id", credor.getId());
			query.setParameter("nome", credor.getNome());
			query.executeUpdate();
			
		} else {
			Query query = manager.createQuery("insert into Credor(id, nome) values (:id, :nome) ");
			query.setParameter("id", credor.getId());
			query.setParameter("nome", credor.getNome());
			query.executeUpdate();
		}
	}
	
}
