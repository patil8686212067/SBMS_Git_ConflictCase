package com.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ashokit.service.UserService;

@SpringBootApplication
public class Application {
	//pradeep is working on HIS-300 with feature-300 branch
     private Static final String Rest_Url="https://www.equifax.com";
	public static void main(String[] args) {
		ConfigurableApplicationContext ctxt =
				SpringApplication.run(Application.class, args);
		
		UserService userService = ctxt.getBean(UserService.class);
		userService.printUserName(101);
     

	
	}

}
