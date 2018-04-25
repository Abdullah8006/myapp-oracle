package com.appster.abdullah.module.api.student.service;

import java.util.List;

import com.appster.abdullah.entity.Student;

public interface StudentService {

    Student addStudent(Student student);

    List<Student> getStudents();

    Student getStudentById(long id);

    Student updateStudent(Student student);

    boolean deleteStudent(Student student);

}
