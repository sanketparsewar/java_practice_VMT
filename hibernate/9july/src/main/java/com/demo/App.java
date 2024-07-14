package com.demo;

import java.util.List;

import java.util.Random;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.model.Student;
import com.utils.HBUtils;


public class App {
	public static void main(String[] args) {
		Session session = HBUtils.sf.openSession();
		Transaction tx = session.beginTransaction();

		/*
		// enter multiple records in table
		for (int i = 1; i <= 5000; i++) { // 5000 records
			Student s1 = new Student();
			StringBuilder name = new StringBuilder();
			StringBuilder city = new StringBuilder();
			for (int j = 1; j <= 15; j++) {
				name.append((char) (new Random().nextInt(26) + 65)); // 15 characters name and city
				city.append((char) (new Random().nextInt(26) + 65));
			}
			s1.setSname(name.toString()); // converted to string
			s1.setScity(city.toString());
			s1.setSpercentage(new Random().nextDouble() * 100); // give value between 0 to 1 the multiply with 100
			session.save(s1);
			
			//for entering records fast in table set hibernate.show_sql as false 
		}
		
		*/
//		------------------------------------
		//HQL query is case sensitive as it works with Class and property
		/*
		Query<Student> q = session.createQuery("from Student",Student.class);
		List<Student> list=q.list();
		for(Student s:list)
			System.out.println(s);
		*/
//		-----------------------------
		//where clause
		//setParameter used to pass parameter in query
		/*
		Query<Student> q = session.createQuery("from Student where sid=:a",Student.class);
		q.setParameter("a", 3);
		Student s=q.uniqueResult();
		System.out.println(s);
		*/
//		-------------------------------------
		//setmax use to set limit 
		//return instance of Query interface
		/*
		Query<Student> q = session.createQuery("from Student",Student.class);
		q.setMaxResults(30);
		List<Student> list = q.list();
		for(Student s:list) 
			System.out.println(s);
		*/
//		-------------------------------------
		//setFirstResult used to skip that number of records
		/*
		Query<Student> q = session.createQuery("from Student",Student.class);
		q.setFirstResult(4999);
		List<Student> list = q.list();
		for(Student s:list)
			System.out.println(s);
		*/
//		------------------------------------
//		display all students through method chaining
		/*
		session.createQuery("from Student",Student.class)
		.list()
		.forEach(e->System.out.println(e));
		*/
//		or
		/*
		List<Student> list = session.createQuery("from Student",Student.class)
		.list();
		for(Student s:list)
			System.out.println(s);
		*/
//		-------------------------------------
		//find student by sid 
		/*
		Student s= session.createQuery("from Student where sid=:a",Student.class)
				.setParameter("a", 5)
				.uniqueResult();
		System.out.println(s);
		*/
//		--------------------------------------
		//find student by sid or sname gives multiple records 
		/*
		List<Student> list = session.createQuery("from Student where sid=:a or sname=:b",Student.class)
				.setParameter("a", 6)
				.setParameter("b", "UKMEKXHKVLIJYOD")
				.list();
		for(Student s :list)
			System.out.println(s);
		*/
//		-----------------------------------------
		//finding the student by the sid and sname
		/*
		Student s = session.createQuery("from Student where sid =:a and sname=:b",Student.class)
				.setParameter("a",5)
				.setParameter("b", "UKMEKXHKVLIJYOD")
				.uniqueResult();
		System.out.println(s);
		*/
//		--------------------------------------------
		//find studets record by spercentage in between range
		/*
		List<Student> list = session.createQuery("from Student where spercentage between :a and :b order by spercentage",Student.class)
				.setParameter("a",10.0)
				.setParameter("b", 20.0)
				.list();
		for(Student s:list)
			System.out.println(s);
		 */
		
		
		
		
		
		tx.commit(); 
		session.close();
	}
}
