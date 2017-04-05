package com.appster.abdullah.springIntegration;

import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;
import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.integration.dsl.IntegrationFlow;
import org.springframework.integration.dsl.IntegrationFlows;
import org.springframework.integration.dsl.http.Http;

@MessageEndpoint
public class WebserviceOutboundAdaptor {

	@Bean
	public IntegrationFlow httpOut() {
	    return IntegrationFlows.from("publishSubscribeChannel")
	            .handle(Http.outboundGateway("http://localhost:8090/myapp/userstats/1")
	                    .charset("UTF-8")
	                    .httpMethod(HttpMethod.GET)).channel("baseChannel")
	            .get();
	}

}
