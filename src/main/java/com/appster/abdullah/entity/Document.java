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
@Table(name = "document")
public class Document extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @Enumerated(EnumType.STRING)
    @Column(name = "type")
    private AppConstant.DocumentType type;

    @Column(name = "path")
    private String path;

    @Column(name = "owner_type")
    private AppConstant.DocumentOwner ownerType;

    @ManyToOne
    private User user;

    @ManyToOne
    private Student student;
}
