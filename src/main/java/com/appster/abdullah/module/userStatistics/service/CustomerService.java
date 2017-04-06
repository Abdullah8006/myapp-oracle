package com.appster.abdullah.module.userStatistics.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appster.abdullah.entity.Address;
import com.appster.abdullah.entity.Customer;
import com.appster.abdullah.repository.CustomerRepository;

@Service
@Transactional
public class CustomerService {

	@Autowired
	private CustomerRepository customerRepo;

	@Transactional
	public Customer addCustomer(Customer newCustomer) {

		Customer customer = new Customer();
		customer.setName("Akhlad");

		List<Address> addresses = new ArrayList<>();

		Address address1 = new Address();
		address1.setCity("asdf");
		address1.setCountry("India");
		address1.setCustomer(customer);
		addresses.add(address1);

		Address add2 = new Address();
		add2.setCity("Delhi");
		add2.setCountry("Bahrain");
		add2.setCustomer(customer);
		addresses.add(add2);

		customer.setAddress(addresses);
		customer = customerRepo.save(customer);
		return customer;
	}
}
