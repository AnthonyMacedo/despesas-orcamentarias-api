package com.despesasorcamentarias.infrastructure.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

import com.despesasorcamentarias.domain.model.CategoriaEconomica;
import com.despesasorcamentarias.domain.repository.CategoriaEconomicaRepository;
import com.despesasorcamentarias.domain.repository.queries.CategoriaEconomicaQueries;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;

@Repository
public class CategoriaEconomicaRepositoryImpl implements CategoriaEconomicaQueries {

	@PersistenceContext
	private EntityManager manager;

	@Autowired @Lazy
	private CategoriaEconomicaRepository categoriaEconomicaRepository;

	@Override
	public void adicionarOuAtualizar(CategoriaEconomica categoriaEconomica) {
		
		if (categoriaEconomicaRepository.isEntidadeExistente(categoriaEconomica.getId())) {
			
			Query query = manager.createQuery("update CategoriaEconomica a set a.nome = :nome where a.id = :id ");
			query.setParameter("id", categoriaEconomica.getId());
			query.setParameter("nome", categoriaEconomica.getNome());
			query.executeUpdate();
			
		} else {
			Query query = manager.createQuery("insert into CategoriaEconomica(id, nome) values (:id, :nome) ");
			query.setParameter("id", categoriaEconomica.getId());
			query.setParameter("nome", categoriaEconomica.getNome());
			query.executeUpdate();
		}
	}

	
}
