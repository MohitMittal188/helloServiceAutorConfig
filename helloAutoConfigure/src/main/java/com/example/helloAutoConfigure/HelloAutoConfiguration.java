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
@EnableConfigurationProperties(HelloConfiguration.class)
public class HelloAutoConfiguration {
	
	HelloConfiguration helloConfiguration;
	
	HelloAutoConfiguration(HelloConfiguration helloConfiguration){
		this.helloConfiguration = helloConfiguration;
	}
	
	@Bean
	@ConditionalOnMissingBean
	HelloService getHelloService() {
		return new ConsoleHelloService(helloConfiguration.getPrefix(),helloConfiguration.getSuffix());
	}
}
