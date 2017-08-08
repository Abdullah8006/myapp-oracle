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
@Table(name = "user_notification")
public class UserNotification extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @Embedded
    private DateSeen dateSeen;

    @Column(name = "status")
    private AppConstant.NotificationStatus status = AppConstant.NotificationStatus.UNREAD;

    @ManyToOne
    private User user;
    
    @ManyToOne
    private Notification notification;
    
}
