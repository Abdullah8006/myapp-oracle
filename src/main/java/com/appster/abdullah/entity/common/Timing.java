package com.appster.abdullah.entity.common;

import java.io.Serializable;
import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Timing implements Serializable{

	private static final long serialVersionUID = 1L;

	@Column(name="start_time")
	private Time startTime;
	
	@Column(name="end_time")
    private Time endTime;
	
}
