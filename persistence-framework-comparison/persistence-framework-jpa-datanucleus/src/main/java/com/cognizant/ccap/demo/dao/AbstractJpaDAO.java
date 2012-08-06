package com.cognizant.ccap.demo.dao;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.apache.log4j.Logger;

public abstract class AbstractJpaDAO<T, PK extends Serializable> {

	protected Logger logger = Logger.getLogger(AbstractJpaDAO.class);
	protected Class<T> type = getPersistentClass();

	@PersistenceContext
	EntityManager entityManager;

	@SuppressWarnings("unchecked")
	protected final Class<T> getPersistentClass() {
		return (Class<T>) ((ParameterizedType) getClass()
				.getGenericSuperclass()).getActualTypeArguments()[0];
	}

	public T findOne(final PK id) {
		return this.entityManager.find(this.type, id);
	}

	@SuppressWarnings("unchecked")
	public List<T> findAll() {
		Query q = this.entityManager.createQuery("from " + this.type.getName());
		return q.getResultList();
	}

	public void save(final T entity) {
		this.entityManager.persist(entity);
	}

	public T update(final T entity) {
		return this.entityManager.merge(entity);
	}

	public void delete(final T entity) {
		this.entityManager.remove(entity);
	}

	public void deleteById(final PK entityId) {
		final T entity = findOne(entityId);
		this.delete(entity);
	}
}