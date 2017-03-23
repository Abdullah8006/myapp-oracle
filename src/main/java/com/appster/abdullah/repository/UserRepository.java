package com.appster.abdullah.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.appster.abdullah.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
