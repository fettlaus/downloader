package de.fettlaus.downloader.service;

import java.util.List;

import de.fettlaus.downloader.service.model.Config;
import de.fettlaus.downloader.service.model.User;

public interface HelloService {

	public void newUser(final String username);

	public void deleteuser(final long id);

	public List<User> getUsers();

	public Config getConfig();

	public Config makeAdmin(final long id);

}