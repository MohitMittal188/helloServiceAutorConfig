package com.example.helloAutoConfigure;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.helloservice.ConsoleHelloService;
import com.example.helloservice.HelloService;

@Configuration
@ConditionalOnClass(HelloService.class)
public class HelloAutoConfiguration {
	
	@Bean
	@ConditionalOnMissingBean
	HelloService getHelloService() {
		return new ConsoleHelloService("hello","!");
	}
}
