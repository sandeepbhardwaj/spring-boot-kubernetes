package com.koko.springboot.messageproducer.controller;

import com.koko.springboot.messageproducer.MessageConfiguration;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
class MessageController {

	@Autowired
	private MessageConfiguration configuration;

	@RequestMapping("/message")
	public String greeting() {
		log.info("Inside message method");
		return configuration.getGreeting();
	}

	@Scheduled(fixedDelay = 3000)
	public void scheduleMessage() {
		log.info("Greeting :{}, Message: {}", configuration.getGreeting(), configuration.getFarewell());
	}
}