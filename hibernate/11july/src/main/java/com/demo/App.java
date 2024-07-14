package com.demo;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import com.model.Student;
import com.utils.HBUtils;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	Session session=HBUtils.sf.openSession();
    	Transaction tx= session.beginTransaction();

    	//display all the students record
    	/*
    	List<Student> list = session.createCriteria(Student.class)
    	 .list();
    	list.forEach(e->System.out.println(e));
    	 */
//    	-----------------------------------------
    	
    	//display student through id
    	/*
    	Student s = (Student) session.createCriteria(Student.class)
    	.add(Restrictions.eq("sid",5))
    	.uniqueResult();
    	
    	System.out.println(s);
    	*/
//    	------------------------------------------
    	
    	//display student having less than the given percentage
    	/*
    	List<Student> list = session.createCriteria(Student.class)
    	.add(Restrictions.lt("spercentage",50.0))
    	.list();
    	
    	list.forEach(s->System.out.println(s));
    	*/
//    	--------------------------------------------
    	//display record not equal to given restriction
    	/*
    	List<Student> list = session.createCriteria(Student.class)
    	.add(Restrictions.ne("scity","pune"))
    	.list();
    	
    	list.forEach(s->System.out.println(s));
    	*/
//    	---------------------------------------------
    	
    	//disply students having percentage greater than given value
    	/*
    	List<Student> list = session.createCriteria(Student.class)
    	.add(Restrictions.gt("spercentage", 95.0))
    	.list();
    	
    	list.forEach(s->System.out.println(s));
    	*/
//    	---------------------------------------------
    	//display students records having percentage between given range
    	/*
    	List<Student> list = session.createCriteria(Student.class)
    	.add(Restrictions.between("spercentage", 10.0, 12.0))
    	.list();
    	
    	list.forEach(s->System.out.println(s));
    	*/
    	
//    	---------------------------------------------
    	
    	//display record matching list of ids
    	/*
    	List<Integer> id=new ArrayList<Integer>();
    	id.add(89);
    	id.add(56);
    	id.add(32);
    	id.add(32);
    	List<Student> list = session.createCriteria(Student.class)
    	.add(Restrictions.in("sid",id))
    	.list();
    	
    	list.forEach(s->System.out.println(s));
    	*/
//    	---------------------------------------------
    	//display record using sname and scity
    	/*
    	Student s = (Student) session.createCriteria(Student.class)
    	.add(Restrictions.and(Restrictions.eq("sname","Sank")).add(Restrictions.eq("scity", "pune")))
    	.uniqueResult();
    	
    	System.out.println(s);
    	*/
//    	OR - there is by default and in between two added restrictions conditions
    	/*
    	Student s = (Student)session.createCriteria(Student.class)
    	.add(Restrictions.eq("sid", 6))
    	.add(Restrictions.eq("sname", "NZYQEDIAGBJJSIU"))
    	.uniqueResult();
    	
    	System.out.println(s);
    	*/
//    	--------------------------------------------
    	
    	//display record that match sid or sname
    	/*
    	List<Student> list = session.createCriteria(Student.class)
    	.add(Restrictions.or(Restrictions.eq("sid",10)).add(Restrictions.eq("sname","NZYQEDIAGBJJSIU")))
    	.list();
    	
    	list.forEach(s->System.out.println(s));
    	*/
    	
//    	--------------------------------------------
    	//display all students sname contains
    	/*
    	List<Student> list = session.createCriteria(Student.class)
    	.add(Restrictions.like("scity", "%DDD%"))
    	.list();
    	
    	list.forEach(s->System.out.println(s));
    	*/
    	
//    	--------------------------------------------	
    	
    	//display students by percentage in ascending order
    	/*
    	List<Student> list = session.createCriteria(Student.class)
    	.addOrder(Order.asc("spercentage"))
    	.list();
    	list.forEach(s->System.out.println(s));
    	*/
//    	-----------------------------------------
    	//display students by percentage in descending order
    	/*
    	List<Student> list = session.createCriteria(Student.class)
    	.addOrder(Order.desc("spercentage"))
    	.list();
    	
    	list.forEach(s->System.out.println(s));
    	*/
//    	-----------------------------------------
    	//display students by less percentage less than order by sity
    	/*
    	List<Student> list = session.createCriteria(Student.class)
    	.add(Restrictions.lt("spercentage",10.0))
    	.addOrder(Order.asc("scity"))
    	.list();
    	
    	list.forEach(s->System.out.println(s));
    	*/
    	
//    	-----------------------------------------
    	//display only the names of the students 
    	/*
    	List<String> list = session.createCriteria(Student.class)
    	.setProjection(Projections.property("sname"))
    	.list();
    	
    	list.forEach(s->System.out.println(s));
    	*/
//    	----------------------------------------
    	
    	//display highest percentage
    	/*
    	double maximum = (double) session.createCriteria(Student.class)
    	.setProjection(Projections.max("spercentage"))
    	.uniqueResult();
    	
    	System.out.println("Maximum percentage: "+maximum);
    	*/
//    	-----------------------------------------
    	//display minimum percentage
    	/*
    	double minimum = (double) session.createCriteria(Student.class)
    	.setProjection(Projections.min("spercentage"))
    	.uniqueResult();
    	
    	System.out.println("Minimum percentage : "+minimum);
    	*/
    	
//    	----------------------------------------
    	//display the count of the no of records present in the table
    	/*
    	long count = (long) session.createCriteria(Student.class)
    	.setProjection(Projections.count("sid"))
    	.uniqueResult();
    	
    	System.out.println("No of records in table: "+count);
    	*/
    	
//    	----------------------------------------
    	//display the average of the percentage
    	/*
    	double avg = (double) session.createCriteria(Student.class)
    	.setProjection(Projections.avg("spercentage"))
    	.uniqueResult();
    	
    	System.out.println("average of percentage : "+avg);
    	*/
//    	---------------------------------------
    	
    	
    	
    	
    	
    	tx.commit();
    	session.close();
    	
    }
}
