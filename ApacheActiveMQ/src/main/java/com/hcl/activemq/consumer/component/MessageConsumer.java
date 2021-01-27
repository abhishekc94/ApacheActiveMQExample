package com.hcl.activemq.consumer.component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.hcl.activemq.model.SystemMessage;

@Component
public class MessageConsumer {
	
	private static final Logger logger = LoggerFactory.getLogger(MessageConsumer.class);
	
	@JmsListener(destination = "technoclan_queue")
	public void messageListner(SystemMessage message) {
		logger.info("Message received "+message);
	}
}
