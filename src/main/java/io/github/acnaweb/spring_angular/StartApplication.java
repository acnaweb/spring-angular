package io.github.acnaweb.spring_angular;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class StartApplication {

	@Autowired
	@Qualifier("applicationName")
	private String applicationName;

	public static void main(String[] args) {
		SpringApplication.run(StartApplication.class, args);
	}

	@GetMapping("/hello")
	public String helloWorld() {
		return applicationName;
	}
}
