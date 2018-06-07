package org.launchcode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class TechjobsApplication {

	public static void main(String[] args) {
		final ConfigurableApplicationContext run = SpringApplication.run(TechjobsApplication.class, args);
	}
}
