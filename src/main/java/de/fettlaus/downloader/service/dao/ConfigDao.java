package de.fettlaus.downloader.service.dao;

import de.fettlaus.downloader.service.model.Config;

public interface ConfigDao extends GenericDao<Config> {

	Config get();

}
