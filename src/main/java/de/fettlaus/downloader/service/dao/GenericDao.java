package de.fettlaus.downloader.service.dao;

import java.util.List;

import de.fettlaus.downloader.service.model.DomainObject;

public interface GenericDao<T extends DomainObject> {

	public T get(Long id);

	public List<T> getAll();

	public void save(T object);

	public void delete(T object);

}
