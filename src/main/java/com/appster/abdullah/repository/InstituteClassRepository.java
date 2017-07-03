package com.appster.abdullah.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.appster.abdullah.entity.InstituteClass;

public interface InstituteClassRepository extends JpaRepository<InstituteClass, Long> {

	//join fetch instituteClass.institute instituteClass 
	@Query("Select instituteClass from InstituteClass instituteClass where instituteClass.name like '%lass%'")
	List<InstituteClass> findAllChildAndParentByParentName();

}
