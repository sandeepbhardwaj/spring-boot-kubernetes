package com.koko.springboot.messageconsumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@Slf4j
@RestController
public class MessageController {
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/message")
    private String message() {
        log.info("Inside message method");
        String message = restTemplate.getForObject("http://message-producer/message", String.class);
        log.info("Message from message-produces:s {}", message);
        return message;
    }
}