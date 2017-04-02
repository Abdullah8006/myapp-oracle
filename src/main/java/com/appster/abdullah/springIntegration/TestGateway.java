package com.appster.abdullah.springIntegration;

import java.util.List;

import org.springframework.integration.annotation.Gateway;
import org.springframework.integration.annotation.GatewayHeader;
import org.springframework.integration.annotation.MessagingGateway;
import org.springframework.messaging.Message;

import com.appster.abdullah.entity.User;

@MessagingGateway(name = "testGateway", defaultRequestChannel = "publishSubscribeChannel", defaultHeaders = @GatewayHeader(name = "calledMethod", expression = "#gatewayMethod.name"))
public interface TestGateway {

	@Gateway
	public void updateUserStatistics(Message<List<User>> message);

}