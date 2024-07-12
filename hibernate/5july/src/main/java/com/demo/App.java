package com.demo;

import java.util.Random;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.model.Address;
import com.model.Student;

public class App {
	public static void main(String[] args) {

		Configuration con = new Configuration().configure();
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();

		Student s = new Student();
		s.setSname("Sanket");
		s.setScity("nanded");
		s.setSpercentage(545.2);
		s.setSphone(456545755);

		Address a1 = new Address();
		a1.setLine1("karantej");
		a1.setLine2("warje");
		a1.setCity("Pune");
		a1.setState("Maharashtra");
		s.setAddress(a1);
		session.save(s);

		tx.commit();
		session.close();
	}
}
