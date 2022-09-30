package com.javatechie.validation;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class ValidationApplication {

	static Logger logger= LogManager.getLogger(ValidationApplication.class);
	public static void main(String[] args) {

		SpringApplication.run(ValidationApplication.class, args);

		//levels

		logger.trace("This is trace message");
		logger.debug("This is debug message");
		logger.info("This is info message");
		logger.warn("This is warn message");
		logger.error("This is error message");
		logger.fatal("This is fatal message");
	}

}
