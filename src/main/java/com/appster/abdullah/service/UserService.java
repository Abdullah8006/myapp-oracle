package com.appster.abdullah.service;

import com.appster.abdullah.entity.User;

public interface UserService {

	User getById(long id);
	
	void testCriteriaQuery();
	
	User addUser(User user);
}
