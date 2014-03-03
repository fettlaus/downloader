package de.fettlaus.downloader.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import de.fettlaus.downloader.service.dao.ConfigDao;
import de.fettlaus.downloader.service.dao.HelloDao;
import de.fettlaus.downloader.service.model.Config;
import de.fettlaus.downloader.service.model.User;

@Service
public class UserServiceImpl implements UserService {

	@Inject
	private HelloDao helloDao;

	@Inject
	private ConfigDao configDao;

	@Override
	@Transactional
	public void newUser(final String username) {
		User user = new User();
		user.setName(username);
		helloDao.save(user);
	}

	@Override
	@Transactional(readOnly = true)
	public List<User> getUsers() {
		return helloDao.getAll();
	}

	@Transactional
	@Override
	public void deleteuser(final long id) {
		User usr = helloDao.get(id);
		helloDao.delete(usr);

	}

	@Transactional(readOnly = true)
	@Override
	public Config getConfig() {
		return configDao.get();
	}

	@Transactional
	@Override
	public Config makeAdmin(final long id) {
		Config config = configDao.get();
		if (config == null) {
			config = new Config();
		}

		User user = helloDao.get(id);
		if (user == null) {
			return null;
		}

		config.setAdmin(user);
		configDao.save(config);
		return config;
	}

}
