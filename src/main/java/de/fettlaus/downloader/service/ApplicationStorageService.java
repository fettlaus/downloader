package de.fettlaus.downloader.service;

import java.util.List;

import de.fettlaus.downloader.service.model.Application;

public interface ApplicationStorageService {
	
	/**
	 * Returns a list of all applications, both disabled and enabled.
	 * @return
	 */
	public List<Application> getAllApplications();
	
	/**
	 * Returns the ApplicationService for the application with the given id.
	 * @param id
	 * @return
	 */
	public ApplicationService getApplicationService(int id);
}
