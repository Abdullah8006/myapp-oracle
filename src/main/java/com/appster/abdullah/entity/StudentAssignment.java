package com.appster.abdullah.entity;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.appster.abdullah.entity.common.BaseEntity;
import com.appster.abdullah.entity.common.DateSeen;

@Entity
@Table(name = "student_assignment")
public class StudentAssignment extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @Embedded
    private DateSeen dateSeen;

    @ManyToOne
    private Student student;

    @ManyToOne
    private Assignment assignment;
    
    @OneToOne
    private StudentAssignmentReport report;

}
