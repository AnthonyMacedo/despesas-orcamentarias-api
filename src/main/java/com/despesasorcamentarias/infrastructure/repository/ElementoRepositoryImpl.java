package com.despesasorcamentarias.infrastructure.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

import com.despesasorcamentarias.domain.model.Elemento;
import com.despesasorcamentarias.domain.repository.ElementoRepository;
import com.despesasorcamentarias.domain.repository.queries.ElementoRepositoryQueries;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;

@Repository
public class ElementoRepositoryImpl implements ElementoRepositoryQueries {

	@PersistenceContext
	private EntityManager manager;

	@Autowired @Lazy
	private ElementoRepository elementoRepository;

	@Override
	public void adicionarOuAtualizar(Elemento elemento) {
		
		if (elementoRepository.isEntidadeExistente(elemento.getId())) {
			
			Query query = manager.createQuery("update Elemento e set e.nome = :nome where e.id = :id ");
			query.setParameter("id", elemento.getId());
			query.setParameter("nome", elemento.getNome());
			query.executeUpdate();
			
		} else {
			Query query = manager.createQuery("insert into Elemento(id, nome) values (:id, :nome) ");
			query.setParameter("id", elemento.getId());
			query.setParameter("nome", elemento.getNome());
			query.executeUpdate();
		}
	}
	
}
