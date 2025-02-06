package com.mercury.FirstSpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class FirstSpringBootApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(FirstSpringBootApplication.class, args);

		System.out.println("Rocket Launching....");

		Earth webobj = context.getBean(Earth.class);
		webobj.SpaceStation1();

	}

}
