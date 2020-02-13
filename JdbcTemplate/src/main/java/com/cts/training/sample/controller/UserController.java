package com.cts.training.sample.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cts.training.sample.dao.UserDao;
import com.cts.training.sample.model.User;

public class UserController {
	public static void main(String args[])
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("./applicationContext.xml");
		UserDao userDao=(UserDao) context.getBean("userDaoImpl");
		User user=new User(3,"SowmyaSonyVarsha","ABC29");
		System.out.println(userDao.saveUser(user));
		//System.out.println(userDao.getAllUsers());
		User user1=userDao.getUserById(3);
		boolean query=userDao.deleteUser(user);
		if(query) {
			System.out.println("delete success");
		}
		else {
			System.out.println("try again");
		}
		
	}
	

}
