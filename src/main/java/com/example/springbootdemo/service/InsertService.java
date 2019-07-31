package com.example.springbootdemo.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springbootdemo.dao.UserDAO;
import com.example.springbootdemo.entity.User;

@Service
public class InsertService {
	
	@Autowired
	private UserDAO userDao;
	
	public void insertData(User user) {
		userDao.save(user);
	}

	public void getData(int parseInt) {
		User  user=userDao.getOne(parseInt);
		System.out.println(user.getAge());
		System.out.println(user.getName());

	}	
}
