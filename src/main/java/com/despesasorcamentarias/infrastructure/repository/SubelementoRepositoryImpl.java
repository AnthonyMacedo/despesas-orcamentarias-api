package com.despesasorcamentarias.infrastructure.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

import com.despesasorcamentarias.domain.model.Subelemento;
import com.despesasorcamentarias.domain.repository.SubelementoRepository;
import com.despesasorcamentarias.domain.repository.queries.SubelementoRepositoryQueries;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;

@Repository
public class SubelementoRepositoryImpl implements SubelementoRepositoryQueries {

	@PersistenceContext
	private EntityManager manager;

	@Autowired @Lazy
	private SubelementoRepository subelementoRepository;

	@Override
	public void adicionarOuAtualizar(Subelemento subelemento) {
		
		if (subelementoRepository.isEntidadeExistente(subelemento.getId())) {
			
			Query query = manager.createQuery("update Subelemento e set e.nome = :nome where e.id = :id ");
			query.setParameter("id", subelemento.getId());
			query.setParameter("nome", subelemento.getNome());
			query.executeUpdate();
			
		} else {
			Query query = manager.createQuery("insert into Subelemento(id, nome) values (:id, :nome) ");
			query.setParameter("id", subelemento.getId());
			query.setParameter("nome", subelemento.getNome());
			query.executeUpdate();
		}
	}
	
}
