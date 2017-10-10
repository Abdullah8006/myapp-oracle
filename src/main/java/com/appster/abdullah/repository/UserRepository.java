package com.appster.abdullah.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.appster.abdullah.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);
    
    @Query("Select u from User u where u.username = :username or u.email = :username")
    User findByUsernameOrEmail(@Param("username") String username);
    
}
