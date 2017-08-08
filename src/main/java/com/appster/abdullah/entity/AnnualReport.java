package com.appster.abdullah.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.appster.abdullah.entity.common.BaseEntity;
import com.appster.abdullah.util.AppConstant;

@Entity
@Table(name = "annual_report")
public class AnnualReport extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @Enumerated(EnumType.STRING)
    @Column(name = "grade_received")
    private AppConstant.Grade gradeReceived;

    @Column(name = "remarks")
    private String remarks;

    @OneToOne
    private InstituteClass instituteClass;

    @ManyToOne
    private Student student;

    @ManyToOne
    private User reporter;
}
