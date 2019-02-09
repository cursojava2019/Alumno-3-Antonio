package model.support.jpa;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.transaction.annotation.Transactional;

public abstract class AbstracJpaDao<K extends Serializable, T extends Serializable> implements JpaDao<K, T> {

	@PersistenceContext
	protected EntityManager entityManager;

	protected abstract Class<T> getClase();

	@Transactional
	public T findOne(K id) {
		return this.entityManager.find(getClase(), id);
	}

	@Transactional
	public List<T> findAll() {

		return this.entityManager.createQuery("from " + getClase().getName()).getResultList();
	}

	@Transactional
	public void save(T entity) {
		this.entityManager.persist(entity);
	}

	@Transactional
	public void update(T entity) {
		this.entityManager.merge(entity);
	}

	@Transactional
	public void delete(T entity) {
		this.entityManager.remove(entity);
	}

	@Transactional
	public void deleteById(K entityId) {
		T entity = findOne(entityId);
		delete(entity);
	}
}