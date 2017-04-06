package com.appster.abdullah.module.userStatistics.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appster.abdullah.entity.User;
import com.appster.abdullah.repository.UserRepository;

@Service
public class UserstatService {

	private UserRepository userRepository;

	@Autowired
	public UserstatService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	public User addUser(User userData) {
		return userRepository.save(userData);
	}

	
	
}
