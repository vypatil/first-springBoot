package com.demo.configuration;

import org.springframework.boot.actuate.web.exchanges.HttpExchangeRepository;
import org.springframework.boot.actuate.web.exchanges.InMemoryHttpExchangeRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HttpExchangeConfig {

	@Bean
	public HttpExchangeRepository httpExchangeRepo() {
		
		return new InMemoryHttpExchangeRepository();
	}
}
