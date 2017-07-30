package com.appster.abdullah.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.appster.abdullah.entity.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {

}
