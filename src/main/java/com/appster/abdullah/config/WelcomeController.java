package com.appster.abdullah.config;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.appster.abdullah.entity.User;
import com.appster.abdullah.springIntegration.TestGateway;

@Controller
public class WelcomeController {

	private static final Logger LOG = Logger.getLogger(WelcomeController.class);
	private TestGateway gateway;
	private Environment env;

	@Autowired
	public WelcomeController(TestGateway gateway, Environment evn) {
		this.gateway = gateway;
		this.env = evn;
	}

	@RequestMapping("/")
	public String welcome(Map<String, Object> model) {
		LOG.info("Requesting the home page..");
		User user = new User();
		user.setName("Inamullah wasi");
		System.out.println("The active profile is : " + env.getProperty("spring.active.profile"));
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