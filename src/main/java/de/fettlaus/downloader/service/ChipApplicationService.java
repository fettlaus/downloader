package de.fettlaus.downloader.service;

import de.fettlaus.downloader.service.model.Version;


public class ChipApplicationService implements ApplicationService {

	@Override
	public Version getCurrentVersion(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isUpdateAvailable(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean checkAndUpdate(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getPluginIconURL() {
		// TODO Add Icon
		return "";
	}

	@Override
	public String getPluginName() {
		return "Chip.de";
	}

	@Override
	public String getPluginVersion() {
		return "0.0.1";
	}

}
