package com.patternson.jdzresourceserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@SpringBootApplication
@ComponentScan({"com.patternson"})
@EnableResourceServer
public class JdzResourceServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(JdzResourceServerApplication.class, args);
	}
}
