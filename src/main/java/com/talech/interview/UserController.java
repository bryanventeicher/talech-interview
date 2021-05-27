package com.talech.interview;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {

	private @Autowired UserService userService;

	// TODO create a REST method to GET a user by user id
	// this method should return the User object from the autowired UserService

}