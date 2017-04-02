package com.appster.abdullah.config;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.appster.abdullah.entity.User;
import com.appster.abdullah.springIntegration.TestGateway;

@Controller
public class WelcomeController {

	private TestGateway gateway;

	@Autowired
	public WelcomeController(TestGateway gateway) {
		this.gateway = gateway;
	}

	@RequestMapping("/")
	public String welcome(Map<String, Object> model) {
		User user = new User();
		user.setName("Inamullah wasi");
		gateway.updateUserStatistics(MessageBuilder.withPayload(getUsers()).build());
		model.put("message", "User name : " + " null as of now!");
		return "welcome";
	}

	private List<User> getUsers() {
		List<User> users = new ArrayList<>();

		User userOne = new User();
		userOne.setName("Aamir Arafat");

		User userTwo = new User();
		userTwo.setName("Arsalan Aslam");

		users.add(userOne);
		users.add(userTwo);

		return users;
	}

}