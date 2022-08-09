package com.gabriel.br.apitraining.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@Configuration
public class OpenApiConfig {
	
	@Bean
	public OpenAPI customOpenAPI() {
		return new OpenAPI().info(new Info()
				.title("API REST Training")
				.version("v1")
				.description("Minha API")
				.termsOfService("https://www.google.com.br/")
				.license(new License().name("Apache 2.0")
				.url("https://www.google.com.br")));
	}

}
