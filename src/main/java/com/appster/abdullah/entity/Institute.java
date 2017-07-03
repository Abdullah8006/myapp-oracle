package com.appster.abdullah.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "institue")
public class Institute extends BaseEntity {

	private static final long serialVersionUID = 1L;

	@Column(name = "name")
	private String name;

	@OneToMany(mappedBy = "institute", cascade = CascadeType.ALL)
	private List<InstituteClass> institueClasses;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<InstituteClass> getInstitueClasses() {
		return institueClasses;
	}

	public void setInstitueClasses(List<InstituteClass> institueClasses) {
		this.institueClasses = institueClasses;
	}

}
