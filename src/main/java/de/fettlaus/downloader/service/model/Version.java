package de.fettlaus.downloader.service.model;

import java.io.Serializable;
import java.sql.Timestamp;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Version
 *
 */
@Entity

public class Version implements Serializable, DomainObject {

	   
	@Id
	private long id;
	
	private Timestamp timestamp;
	
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
   
}
