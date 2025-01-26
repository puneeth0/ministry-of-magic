package com.example.magic.ministry.ministry_of_magic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource(value={"classpath:application.properties"})
public class MinistryOfMagicApplication {

	public static void main(String[] args) {
		SpringApplication.run(MinistryOfMagicApplication.class, args);
	}

}
