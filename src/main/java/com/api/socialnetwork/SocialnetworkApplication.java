package com.api.socialnetwork;

import com.api.socialnetwork.config.WebSocketConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Configuration
@Import(WebSocketConfig.class)
public class SocialnetworkApplication {
	public static void main(String[] args) {
		SpringApplication.run(SocialnetworkApplication.class, args);
	}

}
