package io.github.acnaweb.spring_angular;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfiguration {

	@Bean
	public String applicationName() {
		return "Sistema de Vendas";
	}

}
