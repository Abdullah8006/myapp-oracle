package com.appster.abdullah.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "institue")
public class Institute extends BaseEntity {

	@Column(name = "name")
	private String name;

	@OneToMany(mappedBy = "institute")
	private List<InstitueClass> institueClasses;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<InstitueClass> getInstitueClasses() {
		return institueClasses;
	}

	public void setInstitueClasses(List<InstitueClass> institueClasses) {
		this.institueClasses = institueClasses;
	}

}
