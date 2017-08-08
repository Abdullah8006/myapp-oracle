package com.appster.abdullah.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.appster.abdullah.entity.common.Address;
import com.appster.abdullah.entity.common.BaseEntity;
import com.appster.abdullah.util.AppConstant;
import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "student")
public class Student extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="date_of_birth", nullable = false)
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private java.util.Date dateOfBirth;

    @Enumerated(EnumType.STRING)
    @Column(name = "guardian_Type")
    private AppConstant.GuardianType guardianType;

    @Column(name = "guardian_first_name")
    private String guardianFirstName;

    @Column(name = "guardian_last_name")
    private String guardianLastName;

    @Embedded
    private Address address;

    @Column(name = "contact_number_primary", nullable = false)
    private String contactNumberPrimary;

    @Column(name = "contact_number_secondary")
    private String contactNumberSecondary;

    @OneToOne
    private InstituteClass currentClass;

    @OneToMany(mappedBy = "student")
    private List<StudentNotification> notifications;

    @OneToMany(mappedBy = "student")
    private List<StudentAssignment> assignments;

    @OneToMany(mappedBy = "student")
    private List<AnnualReport> annualReport;
    
    @OneToMany(mappedBy = "student")
    private List<Document> documents;

}
