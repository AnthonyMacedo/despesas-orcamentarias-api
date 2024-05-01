package com.despesasorcamentarias.infrastructure.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

import com.despesasorcamentarias.domain.model.Programa;
import com.despesasorcamentarias.domain.repository.ProgramaRepository;
import com.despesasorcamentarias.domain.repository.queries.ProgramaRepositoryQueries;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;

@Repository
public class ProgramaRepositoryImpl implements ProgramaRepositoryQueries {

	@PersistenceContext
	private EntityManager manager;

	@Autowired @Lazy
	private ProgramaRepository programaRepository;

	@Override
	public void adicionarOuAtualizar(Programa programa) {
		
		if (programaRepository.isEntidadeExistente(programa.getId())) {
			
			Query query = manager.createQuery("update Programa a set a.nome = :nome where a.id = :id ");
			query.setParameter("id", programa.getId());
			query.setParameter("nome", programa.getNome());
			query.executeUpdate();
			
		} else {
			Query query = manager.createQuery("insert into Programa(id, nome) values (:id, :nome) ");
			query.setParameter("id", programa.getId());
			query.setParameter("nome", programa.getNome());
			query.executeUpdate();
		}
	}
	
}
