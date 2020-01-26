package com.koko.springboot.messageproducer;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@ConfigurationProperties(prefix = "message")
@Configuration
@Getter
@Setter
public class MessageConfiguration {
	private String greeting;
	private String farewell;
}
