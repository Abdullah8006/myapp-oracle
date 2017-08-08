package com.appster.abdullah.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.appster.abdullah.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
