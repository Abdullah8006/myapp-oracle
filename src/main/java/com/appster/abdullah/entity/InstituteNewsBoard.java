package com.appster.abdullah.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.appster.abdullah.entity.common.BaseEntity;
import com.appster.abdullah.util.AppConstant;

@Entity
@Table(name = "institute_news_board")
public class InstituteNewsBoard extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @Enumerated(EnumType.STRING)
    @Column(name = "producer_type", nullable = false)
    private AppConstant.NewsProducer producerType;

    @Enumerated(EnumType.STRING)
    @Column(name = "consumer_type", nullable = false)
    private AppConstant.NewsConsumer consumerType;

    @Column(name = "title")
    private String title;

    @Lob
    @Column(name = "news")
    private String newsText;

    @ManyToOne
    private User user;

}
