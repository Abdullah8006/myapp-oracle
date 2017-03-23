package com.appster.abdullah.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appster.abdullah.entity.User;
import com.appster.abdullah.repository.UserRepository;
import com.appster.abdullah.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public User getById(long id) {
		return userRepository.findOne(id);
	}

}
