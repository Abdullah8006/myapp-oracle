package com.appster.abdullah.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="institue_class")
public class InstitueClass extends BaseEntity{

	@Column(name = "name")
	private String name;
	
	@ManyToOne
	private Institute institute;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Institute getInstitute() {
		return institute;
	}

	public void setInstitute(Institute institute) {
		this.institute = institute;
	}
	
}
