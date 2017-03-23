package com.appster.abdullah.config;

import java.util.Date;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.appster.abdullah.entity.User;
import com.appster.abdullah.repository.UserRepository;

@Controller
public class WelcomeController {
	
	@Autowired
	private UserRepository userRepository;

	@RequestMapping("/")
	public String welcome(Map<String, Object> model) {

		User newUser = new User();
		newUser.setName("Prakash " + new Date());
		userRepository.save(newUser);

		model.put("message", "User name : " + newUser.getName());
		return "welcome";
	}

}