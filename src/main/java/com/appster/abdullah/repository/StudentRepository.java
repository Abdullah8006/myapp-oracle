package com.appster.abdullah.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.appster.abdullah.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

    @Query("Select s from Student s join fetch s.courses sc join fetch sc.course where s.id = :id")
    Student findByStudentAndCoursesEager(@Param("id") Long id);
}
