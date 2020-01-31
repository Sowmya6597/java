package com.cts.training.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.cts.training.model.Company;

public class CompanyController {
	public static void main(String args[])
	{
		Configuration cfg=new Configuration();
        cfg.configure();
		
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		Company company=new Company(100,"CTS","digital Transformation","Brain Hamphrac",23899101.78);
		session.save(company);
		transaction.commit();
		session.close();
	}

}
