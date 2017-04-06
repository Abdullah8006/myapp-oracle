package com.appster.abdullah.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.appster.abdullah.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
