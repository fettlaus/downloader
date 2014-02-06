package de.fettlaus.downloader.service.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "usertab")
public class User implements Serializable, DomainObject {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private long id;

	@NotNull
	@Column(length = 30)
	private String name;

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public User() {
		super();
		name = "User";
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "[" + id + "," + name + "]";
	}
}
