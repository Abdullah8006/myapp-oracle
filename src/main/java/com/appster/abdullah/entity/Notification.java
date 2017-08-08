package com.appster.abdullah.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.appster.abdullah.entity.common.BaseEntity;
import com.appster.abdullah.util.AppConstant;

@Entity
@Table(name = "notification")
public class Notification extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @Enumerated(EnumType.STRING)
    @Column(name="consumer_type", nullable = false)
    private AppConstant.NotificationConsumerType consumerType;

    @Enumerated(EnumType.STRING)
    @Column(name="producer_type", nullable = false)
    private AppConstant.NotificationProducerType producerType;
    
    @Column(name = "message")
    private String message;

    @ManyToOne
    private User user;

}
