package com.com.github.afrikalimpopo.pet_teleboute.jrtb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"package com.com.github.afrikalimpopo.pet_teleboute.jrtb", "org.telegram.telegrambots"})
public class TelebouteApplication {

	public static void main(String[] args) {
		SpringApplication.run(TelebouteApplication.class, args);
	}

}
