package de.fettlaus.downloader.service.model;

import java.io.Serializable;
import java.lang.String;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Entity implementation class for Entity: Application
 *
 */
@Entity
public class Application implements Serializable {

	   
	@Id
	private long id;
	private Site site;
	private String name;
	private Version currentversion;
	private static final long serialVersionUID = 1L;

	public Application() {
		super();
	}   
	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}   
	public Site getSite() {
		return this.site;
	}

	public void setSite(Site site) {
		this.site = site;
	}   
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}   
	public Version getCurrentVersion() {
		return this.currentversion;
	}

	public void setCurrentVersion(Version currentversion) {
		this.currentversion = currentversion;
	}
   
}
