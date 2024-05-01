package com.despesasorcamentarias.infrastructure.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.support.JpaEntityInformation;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;

import com.despesasorcamentarias.domain.repository.CustomJpaRepository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

public class CustomJpaRepositoryImpl<T, ID> extends SimpleJpaRepository<T, ID> implements CustomJpaRepository<T, ID> {

	private EntityManager manager;
	
	public CustomJpaRepositoryImpl(JpaEntityInformation<T, ?> entityInformation, EntityManager entityManager) {
		super(entityInformation, entityManager);

		this.manager = entityManager;
	}

	@Override
	public Optional<T> buscarPrimeiro() {
		String jpql = "from " + getDomainClass().getName();
		
		T entity = manager.createQuery(jpql, getDomainClass())
			.setMaxResults(1)
			.getSingleResult();
		
		return Optional.ofNullable(entity);
	}

	@Override
	public void detach(T entity) {
		manager.detach(entity);
	}
	
	@Override
	public boolean isEntidadeExistente(Long id) {
		
		TypedQuery<Long> query = manager.createQuery("select count(*) from " + getDomainClass().getName() + " where id = :id ", Long.class);
		
		query.setParameter("id", id);
		
		return query.getSingleResult() > 0;
	}


}
