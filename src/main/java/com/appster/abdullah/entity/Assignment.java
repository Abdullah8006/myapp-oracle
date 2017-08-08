package com.appster.abdullah.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.appster.abdullah.entity.common.BaseEntity;
import com.appster.abdullah.util.AppConstant;

@Entity
@Table(name = "assignment")
public class Assignment extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @Column(name = "work")
    private String work;

    @Column(name = "type")
    private AppConstant.AssignmentType type;

    @ManyToOne
    private InstituteClass instituteClass;
    
    @ManyToOne
    private User user;
}
