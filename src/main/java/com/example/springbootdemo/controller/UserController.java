package com.example.springbootdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springbootdemo.entity.User;
import com.example.springbootdemo.service.InsertService;

@RestController
@RequestMapping(path = "/user")
public class UserController {
	
	@Autowired
	private InsertService insert; 
	
	@PostMapping(path = "/insert",produces = "application/json")
	public void insertData(@RequestBody User user) {
		insert.insertData(user);
				
	}
	@PostMapping(path = "/fetch/{id}",produces = "application/json")
	public void getData(@PathVariable String id) {
		insert.getData(Integer.parseInt(id));
		
	}

}
