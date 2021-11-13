package com.personapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

/**
 * The Class PersonApiApplication.
 */
@SpringBootApplication
@EnableCaching
public class PersonApiApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(PersonApiApplication.class, args);
	}

}
