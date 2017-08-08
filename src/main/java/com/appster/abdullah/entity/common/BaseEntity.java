package com.appster.abdullah.entity.common;

import java.io.Serializable;

import javax.persistence.Embedded;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

/**
 * Super class contains all the properties common to all the child entities
 * 
 * @author Abdullah
 *
 */
@MappedSuperclass
public class BaseEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Embedded
	private Date date;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@PrePersist
	public void createdAt() {
	    java.util.Date newDate = new java.util.Date();
		this.date = new Date(newDate, newDate);
	}

	@PreUpdate
	public void updatedAt() {
	    java.util.Date newDate = new java.util.Date();
		this.date = new Date(this.getDate().getDateCreated(), newDate);
	}

}
