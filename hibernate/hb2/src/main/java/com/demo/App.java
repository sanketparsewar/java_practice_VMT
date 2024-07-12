package com.demo;

import java.sql.Connection;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.model.Employee;

public class App {
	
	public static void main(String[] args) {
		
		Configuration con= new Configuration().configure();
		SessionFactory sf=con.buildSessionFactory();
		Session session=sf.openSession();
		Transaction tx= session.beginTransaction();
		
		
		Employee e= new Employee();
//		e.setEname("SANK");
//		e.setEcity("Mumbai");
//		e.setEaddress("vadgaon,pune");
//		e.setEsalary(4545);
//		session.save(e);
//		System.out.println(session.save(e));  // returns id
		e.setEid(3);
//		session.remove(e);
		e.setEname("parsewar");
		e.setEcity("mumbai");
		e.setEsalary(457865);
		session.update(e);
		
		
		tx.commit();
		session.close();
		
		
	}
}
