package com.myfacebook.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class UserController {
	
	@PostMapping("/login")
	public ResponseEntity<String> validateUser(@RequestBody UserApp user) {
		if (user.getUsername().equalsIgnoreCase("sree") && user.getPassword().equalsIgnoreCase("test")) {
			System.out.println("UserController.validateUser() - login success");
			return new ResponseEntity<String>("{\"status\" : \"Login Successful\"}", HttpStatus.OK);
		} else {
			System.out.println("UserController.validateUser() - login failed");
			return new ResponseEntity<String>("{\"status\" : \"Login failed\"}", HttpStatus.FORBIDDEN);
		}
	}
}
