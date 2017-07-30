package com.appster.abdullah.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "course")
public class Course extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @Column(name = "course_name")
    private String courseName;

    @OneToMany(mappedBy = "course")
    private List<StudentCourse> studentCourses;

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public List<StudentCourse> getStudentCourses() {
        return studentCourses;
    }

    public void setStudentCourses(List<StudentCourse> studentCourses) {
        this.studentCourses = studentCourses;
    }
    
}
