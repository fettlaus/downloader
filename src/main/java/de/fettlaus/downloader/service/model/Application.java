package de.fettlaus.downloader.service.model;

import java.io.Serializable;
import java.lang.String;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.Type;


/**
 * Entity implementation class for Entity: Application
 *
 */
@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public class Application implements Serializable, DomainObject {

	   
	@Id
	@GeneratedValue
	private long id;
	
	@NotNull
	private String name;
	
	private String filename;
	
	@Column(nullable = false, columnDefinition = "CHAR(1)")
	private boolean rename;
	
	@Column(nullable = false, columnDefinition = "CHAR(1)")
	private boolean enabled;
	
	@OneToMany
	private List<Version> history;

	private static final long serialVersionUID = 1L;
	
	@Column()
	@NotNull
	private String plugin;
	
	@Column
	private String regexReplace;
	
	@Column
	private String regexWith;
	
	public Application() {
		super();
	}   
	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}   
 
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}   

   
}
