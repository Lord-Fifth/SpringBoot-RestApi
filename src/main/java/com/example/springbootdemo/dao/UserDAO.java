package com.example.springbootdemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.springbootdemo.entity.User;

@Repository
public interface UserDAO extends JpaRepository<User, Integer>,CrudRepository<User, Integer>{

}
