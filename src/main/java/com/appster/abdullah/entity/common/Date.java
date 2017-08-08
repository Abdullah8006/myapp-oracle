package com.appster.abdullah.entity.common;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;

@Embeddable
public class Date implements Serializable{

	private static final long serialVersionUID = 1L;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_created", nullable = false)
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private java.util.Date dateCreated;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_updated", nullable = false)
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private java.util.Date dateUpdated;
	
	public Date() {
		super();
	}

    public Date(java.util.Date dateCreated, java.util.Date dateUpdated) {
        super();
        this.dateCreated = dateCreated;
        this.dateUpdated = dateUpdated;
    }

    public java.util.Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(java.util.Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public java.util.Date getDateUpdated() {
        return dateUpdated;
    }

    public void setDateUpdated(java.util.Date dateUpdated) {
        this.dateUpdated = dateUpdated;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }
	
}
