package com.appster.abdullah.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Embedded;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

import com.appster.abdullah.entity.embeddable.EmbeddableDate;

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
	private EmbeddableDate date;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public EmbeddableDate getDate() {
		return date;
	}

	public void setDate(EmbeddableDate date) {
		this.date = date;
	}

	@PrePersist
	public void createdAt() {
		Date newDate = new Date();
		this.date = new EmbeddableDate(newDate, newDate);
	}

	@PreUpdate
	public void updatedAt() {
		Date newDate = new Date();
		this.date = new EmbeddableDate(this.getDate().getDateCreated(), newDate);
	}

}
