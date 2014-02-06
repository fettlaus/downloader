package de.fettlaus.downloader.service.dao;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import de.fettlaus.downloader.service.model.DomainObject;

public class GenericDaoJpa<T extends DomainObject> implements GenericDao<T> {

	private Class<T> type;

	@PersistenceContext
	protected EntityManager entityManager;

	public GenericDaoJpa(Class<T> type) {
		super();
		this.type = type;
	}

	@Override
	public T get(Long id) {
		if (id == null) {
			return null;
		} else {
			return entityManager.find(type, id);
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<T> getAll() {
		List<T> l = entityManager.createQuery("from " + type.getName())
				.getResultList();
		System.out.println(Arrays.toString(l.toArray()));
		return l;
	}

	@Override
	public void save(T object) {
		entityManager.persist(object);
	}

	@Override
	public void delete(T object) {
		entityManager.remove(object);
	}

}
