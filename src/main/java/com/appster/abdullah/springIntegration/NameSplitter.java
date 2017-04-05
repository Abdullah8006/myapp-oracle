/*package com.appster.abdullah.springIntegration;

import java.util.List;

import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.integration.annotation.Splitter;
import org.springframework.messaging.Message;

import com.appster.abdullah.entity.User;

@MessageEndpoint
public class NameSplitter {

	@Splitter(inputChannel = "publishSubscribeChannel", outputChannel = "firstNameChannel")
	public List<User> splitNames(Message<List<User>> msg) {
		System.out.println("Calling splitter..");
		return msg.getPayload();
	}
}
*/