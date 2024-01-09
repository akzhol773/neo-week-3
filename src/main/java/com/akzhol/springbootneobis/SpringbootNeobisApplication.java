package com.akzhol.springbootneobis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class SpringbootNeobisApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootNeobisApplication.class, args);
	}

}
