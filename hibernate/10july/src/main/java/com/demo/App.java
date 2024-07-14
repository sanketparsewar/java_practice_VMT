package com.demo;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.model.Student;
import com.utils.HBUtils;

public class App {
	public static void main(String[] args) {
		Session session = HBUtils.sf.openSession();
		Transaction tx = session.beginTransaction();

		
		//student.class in the createQuery parameter is mention to convert the student object
		/*
		Student s = session.createQuery("from Student where sid=:b",Student.class)
				.setParameter("b", 1)
				.uniqueResult();
		System.out.println(s);
		*/
//		-------------------------------------------------
		//for dml Query no need to write Student.class
		//executeUpdate is written for the DML query
		/*
		int check = session.createQuery("delete from Student where sid =:a")
				.setParameter("a", 3)
				.executeUpdate();
		System.out.println(check);
		 */
		
//		-----------------------------------------------
//		Pagination
		/*
		 * List<Student> list= paginationByPage(session, 13); for(Student s :list)
		 * System.out.println(s);
		 */
		
//		----------------------------------------------
		//one way for updating the record from the database
		/*
		Student s= session.get(Student.class, 10);
		s.setSname("sanket");
		int check=session.createQuery("update Student set sname=:a,scity=:b,spercentage=:c where sid=:d")
				.setParameter("a", s.getScity())
				.setParameter("b", s.getSname())
				.setParameter("c", s.getSpercentage())
				.setParameter("d", s.getSid())
				.executeUpdate();
		System.out.println(check);
		*/
//		OR
		//this can be used because the object is in detached state and in update it get record from detached state and sends back
		//it the object or record is not found then the record is saved in table
		/*
		Student s =session.get(Student.class, 8);
		s.setScity("Nanded");
		session.saveOrUpdate(s);
		*/
//		OR
		//as there is commit after setting the value for the desired property the object goes in detached state
		/*
		Student s= session.get(Student.class, 6);
		s.setScity("pune");
		*/
		

		tx.commit();
		session.close();

	}

	/*
	  public static List<Student> paginationByPage(Session session,int page) 
	  { 
		  int size = 20; 
		  return session.createQuery("from Student ",Student.class)
				  .setFirstResult((page-1)*size)
				  .setMaxResults(size) .list();
		  }
	*/
}
