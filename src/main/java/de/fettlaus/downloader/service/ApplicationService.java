package de.fettlaus.downloader.service;

import de.fettlaus.downloader.service.model.Version;

public interface ApplicationService {

	/**
	 * Returns the current version of an application with the given id
	 * @param id
	 * @return
	 */
	public Version getCurrentVersion(int id);
	
	/**
	 * Checks if the application with the the given id can be updated. 
	 * @param id
	 * @return
	 */
	public boolean isUpdateAvailable(int id);
	
	/**
	 * Checks if the application with the given id can be updated and updates it.
	 * @param id
	 * @return
	 */
	public boolean checkAndUpdate(int id);
	
	/**
	 * Returns the name of this plugin's icon.
	 * @return
	 */
	public String getPluginIconURL();
	
	/**
	 * Returns the cononical name of this plugin.
	 * @return
	 */
	public String getPluginName();
	
	/**
	 * Returns the current version of this plugin.
	 * @return
	 */
	public String getPluginVersion();
	
	
}
