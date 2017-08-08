package com.appster.abdullah.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.appster.abdullah.entity.common.BaseEntity;

@Entity
@Table(name = "institute_class")
public class InstituteClass extends BaseEntity {

	private static final long serialVersionUID = 1L;

	@Column(name = "name")
	private String name;

	@ManyToOne
	private Institute institute;
	
	@OneToMany(mappedBy = "instituteClass")
    private List<Assignment> assignments;
	
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
