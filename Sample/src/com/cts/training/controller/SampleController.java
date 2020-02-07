package com.cts.training.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cts.training.model.AccountEntity;

import com.cts.training.model.CustomerEntity;
import com.cts.training.model.CustomerEntity;


public class SampleController {
	public static void main(String args[])
	{
		//BeanFactory beanfactory=new XmlBeanFactory(new ClassPathResource("beans.xml"));
	    ApplicationContext context = new  ClassPathXmlApplicationContext("beans.xml");
		CustomerEntity entity=(CustomerEntity)context.getBean("customer");
		System.out.println("Phone:"+entity.getPhone());
		
	  
	}

}
