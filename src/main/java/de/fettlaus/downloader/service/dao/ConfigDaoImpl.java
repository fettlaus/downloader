package de.fettlaus.downloader.service.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import de.fettlaus.downloader.service.model.Config;

@Repository
public class ConfigDaoImpl extends GenericDaoJpa<Config> implements ConfigDao {

	public ConfigDaoImpl() {
		super(Config.class);
	}

	@Override
	public Config get() {
		List<Config> list = this.getAll();
		if (list.isEmpty()) {
			return null;
		}
		return list.get(0);
	}

}
