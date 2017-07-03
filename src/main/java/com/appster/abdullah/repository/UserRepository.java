package com.appster.abdullah.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.appster.abdullah.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

    @Query(value = "select ( u.age * ?1 ) as ageI from user u where u.id = 1", nativeQuery = true)
    int getAge(Integer number);

    User findUserByUsername(String username);

}
