package com.appster.abdullah.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.appster.abdullah.entity.Institute;
import com.appster.abdullah.util.dataProjection.InstituteProjection;

public interface InstituteRepository extends JpaRepository<Institute, Long> {

	@Query("Select i from Institute i join fetch i.institueClasses iC where iC.name = 'DOOUM'")
	Institute findInstituteAndClassesDooum();
	
	InstituteProjection findByName(String name);

}
