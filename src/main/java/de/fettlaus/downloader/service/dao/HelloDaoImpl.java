package de.fettlaus.downloader.service.dao;

import org.springframework.stereotype.Repository;

import de.fettlaus.downloader.service.model.User;


@Repository
public class HelloDaoImpl extends GenericDaoJpa<User> implements HelloDao {
	
	public HelloDaoImpl() {
		super(User.class);
	}

}
