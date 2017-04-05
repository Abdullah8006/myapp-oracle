package com.appster.abdullah.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.annotation.IntegrationComponentScan;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.integration.channel.DirectChannel;
import org.springframework.integration.channel.FixedSubscriberChannel;
import org.springframework.integration.channel.PublishSubscribeChannel;
import org.springframework.integration.channel.QueueChannel;
import org.springframework.integration.config.EnableIntegration;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.MessageHandler;
import org.springframework.messaging.MessagingException;
import org.springframework.messaging.support.GenericMessage;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

@Configuration
@EnableIntegration
@IntegrationComponentScan("com.appster.abdullah.springIntegration")
public class SpringIntegrationConfig {

	@Bean
	public FixedSubscriberChannel messageChannel() {
		FixedSubscriberChannel subscribableChannel = new FixedSubscriberChannel(new MessageHandler() {
			@Override
			public void handleMessage(Message<?> message) throws MessagingException {
				System.out.println("The received messsage is : " + message.getPayload().toString());
			}
		});
		return subscribableChannel;
	}

	@ServiceActivator(inputChannel = "messageChannel", autoStartup = "customerServiceImpl")
	public void customerServiceActivator() {
		System.out.println("Preparing to send message to the message channel..");
		messageChannel().subscribe(new MessageHandler() {
			@Override
			public void handleMessage(Message<?> message) throws MessagingException {
				System.out.println("The received messsage is : " + message.getPayload().toString());
			}
		});
		messageChannel().send(new GenericMessage<String>("Bingo!! Through gateway!!"));

	}

	@Bean
	public ThreadPoolTaskExecutor executor() {
		ThreadPoolTaskExecutor pool = new ThreadPoolTaskExecutor();
		pool.setCorePoolSize(2);

		pool.setMaxPoolSize(2);
		pool.setWaitForTasksToCompleteOnShutdown(true);
		return pool;
	}

	@Bean
	public PublishSubscribeChannel publishSubscribeChannel() {
		return new PublishSubscribeChannel(executor());
	}

	@Bean
	public QueueChannel queueChannel() {
		return new QueueChannel();
	}

	@Bean
	public MessageChannel baseChannel() {
		return new QueueChannel(10);
	}

	@Bean
	public MessageChannel firstNameChannel() {
		return new DirectChannel();
	}

}
