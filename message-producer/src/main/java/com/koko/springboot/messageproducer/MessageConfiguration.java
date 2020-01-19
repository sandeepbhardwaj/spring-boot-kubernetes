package com.koko.springboot.messageproducer;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@ConfigurationProperties(prefix = "")
@Configuration
@Getter
@Setter
public class MessageConfiguration {
	private String greeting = "Default greeting";
	private String message = "Default message";
}
