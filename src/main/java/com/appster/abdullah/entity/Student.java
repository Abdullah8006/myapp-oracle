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
import com.fasterxml.jackson.annotation.JsonIgnore;

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

    @JsonIgnore
    @Enumerated(EnumType.STRING)
    @Column(name = "guardian_Type")
    private AppConstant.GuardianType guardianType;

    @JsonIgnore
    @Column(name = "guardian_first_name")
    private String guardianFirstName;

    @JsonIgnore
    @Column(name = "guardian_last_name")
    private String guardianLastName;

    @JsonIgnore
    @Embedded
    private Address address;

    @Column(name = "contact_number_primary", nullable = false)
    private String contactNumberPrimary;

    @JsonIgnore
    @Column(name = "contact_number_secondary")
    private String contactNumberSecondary;

    @JsonIgnore
    @OneToOne
    private InstituteClass currentClass;

    @JsonIgnore
    @OneToMany(mappedBy = "student")
    private List<StudentNotification> notifications;

    @JsonIgnore
    @OneToMany(mappedBy = "student")
    private List<StudentAssignment> assignments;

    @JsonIgnore
    @OneToMany(mappedBy = "student")
    private List<AnnualReport> annualReport;
    
    @JsonIgnore
    @OneToMany(mappedBy = "student")
    private List<Document> documents;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public java.util.Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(java.util.Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public AppConstant.GuardianType getGuardianType() {
        return guardianType;
    }

    public void setGuardianType(AppConstant.GuardianType guardianType) {
        this.guardianType = guardianType;
    }

    public String getGuardianFirstName() {
        return guardianFirstName;
    }

    public void setGuardianFirstName(String guardianFirstName) {
        this.guardianFirstName = guardianFirstName;
    }

    public String getGuardianLastName() {
        return guardianLastName;
    }

    public void setGuardianLastName(String guardianLastName) {
        this.guardianLastName = guardianLastName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getContactNumberPrimary() {
        return contactNumberPrimary;
    }

    public void setContactNumberPrimary(String contactNumberPrimary) {
        this.contactNumberPrimary = contactNumberPrimary;
    }

    public String getContactNumberSecondary() {
        return contactNumberSecondary;
    }

    public void setContactNumberSecondary(String contactNumberSecondary) {
        this.contactNumberSecondary = contactNumberSecondary;
    }

    public InstituteClass getCurrentClass() {
        return currentClass;
    }

    public void setCurrentClass(InstituteClass currentClass) {
        this.currentClass = currentClass;
    }

    public List<StudentNotification> getNotifications() {
        return notifications;
    }

    public void setNotifications(List<StudentNotification> notifications) {
        this.notifications = notifications;
    }

    public List<StudentAssignment> getAssignments() {
        return assignments;
    }

    public void setAssignments(List<StudentAssignment> assignments) {
        this.assignments = assignments;
    }

    public List<AnnualReport> getAnnualReport() {
        return annualReport;
    }

    public void setAnnualReport(List<AnnualReport> annualReport) {
        this.annualReport = annualReport;
    }

    public List<Document> getDocuments() {
        return documents;
    }

    public void setDocuments(List<Document> documents) {
        this.documents = documents;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }
    
}
