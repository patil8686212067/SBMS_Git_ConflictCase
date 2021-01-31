package com.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ashokit.service.UserService;

@SpringBootApplication
public class Application {
     public void callRestAPI()
	 {
		 
		 //vithal is working on HIS-301 with feature-301 branch
		 
		 
	 }
	public static void main(String[] args) {
		ConfigurableApplicationContext ctxt =
				SpringApplication.run(Application.class, args);
		
		UserService userService = ctxt.getBean(UserService.class);
		userService.printUserName(101);
     

	
	}

}
