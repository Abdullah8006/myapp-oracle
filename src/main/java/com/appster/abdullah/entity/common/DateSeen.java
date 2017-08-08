package com.appster.abdullah.entity.common;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.appster.abdullah.util.AppConstant;
import com.fasterxml.jackson.annotation.JsonFormat;

@Embeddable
public class DateSeen implements Serializable {

    private static final long serialVersionUID = 1L;

    @Enumerated(EnumType.STRING)
    @Column(name = "seen_status")
    private AppConstant.SeenStatus seenStatus = AppConstant.SeenStatus.NOT_SEEN;

    @Temporal(TemporalType.TIMESTAMP)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private java.util.Date dateSeen;

    public DateSeen() {
        super();
    }

    public DateSeen(java.util.Date dateSeen) {
        super();
        this.dateSeen = dateSeen;
    }

    public java.util.Date getDateSeen() {
        return dateSeen;
    }

    public void setDateSeen(java.util.Date dateSeen) {
        this.dateSeen = dateSeen;
    }

}
