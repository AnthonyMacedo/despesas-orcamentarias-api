package com.despesasorcamentarias.infrastructure.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

import com.despesasorcamentarias.domain.model.FonteRecurso;
import com.despesasorcamentarias.domain.repository.FonteRecursoRepository;
import com.despesasorcamentarias.domain.repository.queries.FonteRecursoRepositoryQueries;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;

@Repository
public class FonteRecursoRepositoryImpl implements FonteRecursoRepositoryQueries {

	@PersistenceContext
	private EntityManager manager;

	@Autowired @Lazy
	private FonteRecursoRepository fonteRecursoRepository;

	@Override
	public void adicionarOuAtualizar(FonteRecurso fonteRecurso) {
		
		if (fonteRecursoRepository.isEntidadeExistente(fonteRecurso.getId())) {
			
			Query query = manager.createQuery("update FonteRecurso a set a.nome = :nome where a.id = :id ");
			query.setParameter("id", fonteRecurso.getId());
			query.setParameter("nome", fonteRecurso.getNome());
			query.executeUpdate();
			
		} else {
			Query query = manager.createQuery("insert into FonteRecurso(id, nome) values (:id, :nome) ");
			query.setParameter("id", fonteRecurso.getId());
			query.setParameter("nome", fonteRecurso.getNome());
			query.executeUpdate();
		}
	}
	
}
