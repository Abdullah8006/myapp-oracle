package com.appster.abdullah.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.appster.abdullah.entity.common.Address;
import com.appster.abdullah.entity.common.BaseEntity;
import com.appster.abdullah.entity.common.Timing;
import com.appster.abdullah.util.AppConstant;

@Entity
@Table(name = "institue")
public class Institute extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @Column(name = "name")
    private String name;

    @Enumerated(EnumType.STRING)
    @Column(name = "institute_type")
    private AppConstant.InstituteType instituteType;

    @Embedded
    private Address address;

    @Embedded
    private Timing timing;

    @OneToMany(mappedBy = "institute", cascade = CascadeType.ALL)
    private List<User> employees;

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

    public List<User> getEmployees() {
        return employees;
    }

    public void setEmployees(List<User> employees) {
        this.employees = employees;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

}
