package com.qijiabin.controller;

import com.qijiabin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping("/insert")
	public Integer insertUser(String name, Integer age) {
		return userService.insertUser(name, age);
	}

}