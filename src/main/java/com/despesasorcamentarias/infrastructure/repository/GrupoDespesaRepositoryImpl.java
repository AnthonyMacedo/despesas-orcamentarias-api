package com.despesasorcamentarias.infrastructure.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

import com.despesasorcamentarias.domain.model.GrupoDespesa;
import com.despesasorcamentarias.domain.repository.GrupoDespesaRepository;
import com.despesasorcamentarias.domain.repository.queries.GrupoDespesaRepositoryQueries;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;

@Repository
public class GrupoDespesaRepositoryImpl implements GrupoDespesaRepositoryQueries {

	@PersistenceContext
	private EntityManager manager;

	@Autowired @Lazy
	private GrupoDespesaRepository grupoDespesaRepository;

	@Override
	public void adicionarOuAtualizar(GrupoDespesa grupoDespesa) {
		
		boolean grupoDespesaExistente = grupoDespesaRepository.isEntidadeExistente(grupoDespesa.getId());
		
		if (grupoDespesaExistente) {
			
			Query query = manager.createQuery("update GrupoDespesa a set a.nome = :nome where a.id = :id ");
			query.setParameter("id", grupoDespesa.getId());
			query.setParameter("nome", grupoDespesa.getNome());
			query.executeUpdate();
			
		} else {
			Query query = manager.createQuery("insert into GrupoDespesa(id, nome) values (:id, :nome) ");
			query.setParameter("id", grupoDespesa.getId());
			query.setParameter("nome", grupoDespesa.getNome());
			query.executeUpdate();
		}
	}
	
}
