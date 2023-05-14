package com.example.pla.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.pla.Service.UserService;
import com.example.pla.model.User;

@RestController
@RequestMapping("/api/v1")
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping
	public String  getAllUsers() {
		List<User> usersList =  userService.getAllUser();

		System.err.println(usersList.size());
		return "surya";
	}
}