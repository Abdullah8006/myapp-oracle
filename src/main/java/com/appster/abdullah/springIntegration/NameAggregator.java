package com.appster.abdullah.springIntegration;

import java.util.List;

import org.springframework.integration.annotation.Aggregator;
import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.messaging.Message;

import com.appster.abdullah.entity.User;

@MessageEndpoint
public class NameAggregator {

	@Aggregator(inputChannel = "firstNameChannel", outputChannel="baseChannel")
	public String getAllFirstNames(List<Message<User>> msg) {
		System.out.println("there...");
		for (Message<User> m : msg) {
			System.out.println("name" + m.toString());
		}
		return "nullChannel";
	}
}
