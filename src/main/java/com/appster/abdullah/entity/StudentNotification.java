package com.appster.abdullah.entity;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.appster.abdullah.entity.common.BaseEntity;
import com.appster.abdullah.entity.common.DateSeen;
import com.appster.abdullah.util.AppConstant;

@Entity
@Table(name = "student_notification")
public class StudentNotification extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @Embedded
    private DateSeen dateSeen;

    @Column(name = "status")
    private AppConstant.NotificationStatus status = AppConstant.NotificationStatus.UNREAD;
    
    @Column(name = "grades")
    private AppConstant.Grade grades;

    @ManyToOne
    private Student student;

    @ManyToOne
    private Notification notification;

}
