package de.fettlaus.downloader.service.model;

import java.io.Serializable;
import java.sql.Timestamp;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Version
 *
 */
@Entity

public class Version implements Serializable {

	   
	@Id
	private long id;
	private Timestamp timestamp;
	private Application application;
	private Site site;
	private static final long serialVersionUID = 1L;

	public Version() {
		super();
	}   
	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}   
	public Timestamp getTimestamp() {
		return this.timestamp;
	}

	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}   
	public Application getApplication() {
		return this.application;
	}

	public void setApplication(Application application) {
		this.application = application;
	}   
	public Site getSite() {
		return this.site;
	}

	public void setSite(Site site) {
		this.site = site;
	}
   
}
