package de.fettlaus.downloader.service.model;

import java.io.Serializable;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: ChipDownloadPlugin
 *
 */
@Entity
public class ChipApplication extends Application implements Serializable, DomainObject {

	private static final long serialVersionUID = 1L;
	
	@Column
	private String appURL;

	public ChipApplication() {
		super();
	}
   
}
