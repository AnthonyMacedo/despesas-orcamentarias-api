package com.despesasorcamentarias.infrastructure.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

import com.despesasorcamentarias.domain.model.Orgao;
import com.despesasorcamentarias.domain.repository.OrgaoRepository;
import com.despesasorcamentarias.domain.repository.queries.OrgaoRepositoryQueries;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;

@Repository
public class OrgaoRepositoryImpl implements OrgaoRepositoryQueries {

	@PersistenceContext
	private EntityManager manager;

	@Autowired @Lazy
	private OrgaoRepository orgaoRepository;

	@Override
	public void adicionarOuAtualizar(Orgao orgao) {
		
		if (orgaoRepository.isEntidadeExistente(orgao.getId())) {
			
			Query query = manager.createQuery("update Orgao a set a.nome = :nome where a.id = :id ");
			query.setParameter("id", orgao.getId());
			query.setParameter("nome", orgao.getNome());
			query.executeUpdate();
			
		} else {
			Query query = manager.createQuery("insert into Orgao(id, nome) values (:id, :nome) ");
			query.setParameter("id", orgao.getId());
			query.setParameter("nome", orgao.getNome());
			query.executeUpdate();
		}
	}
	
}
