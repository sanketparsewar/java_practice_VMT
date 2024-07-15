package com.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import com.fasterxml.classmate.AnnotationOverrides.StdBuilder;
import com.model.Student;
import com.utils.HBUtils;

public class App 
{
    public static void main( String[] args )
    {

    	Session session =HBUtils.sf.openSession();
    	Transaction tx= session.beginTransaction();
    	
    	//display 1st max percentage student
    	//there can be multiple record with the first max percentage
    	/*
    	List<Student> list = session.createCriteria(Student.class)
    	.add(Restrictions.eq("spercentage", session.createCriteria(Student.class)
    	.setProjection(Projections.max("spercentage")).uniqueResult()))
    	.list();
    	
    	for(Student s:list)
    		System.out.println(s);
    	*/
//    	-------------------------------------------------
    	//display 1st min percentage
    	//there can be multiple record with the first min percentage
    	/*
    	List<Student> list =session.createCriteria(Student.class)
    	.add(Restrictions.eq("spercentage",session.createCriteria(Student.class)
    	.setProjection(Projections.min("spercentage")).uniqueResult()))
    	.list();
    	
    	for(Student s:list)
    		System.out.println(s);
    	*/
//    	------------------------------------------------
    	//display 2nd max percentage
    	//there can be multiple records with the second max percentage so list is used
    	/*
    	List<Student> list = session.createCriteria(Student.class)
    	.add(Restrictions.eq("spercentage", session.createCriteria(Student.class)
    	.add(Restrictions.lt("spercentage", session.createCriteria(Student.class)
    	.setProjection(Projections.max("spercentage")).uniqueResult()))
    	.setProjection(Projections.max("spercentage")).uniqueResult()))
    	.list();
    	
    	list.forEach(s->System.out.println(s));
    	*/
//    	-----------------------------------------------
    	//display 2nd min percentage
    	//there can be multiple records so we used list
    	/*
    	List<Student> list = session.createCriteria(Student.class)
    	.add(Restrictions.eq("spercentage", session.createCriteria(Student.class)
    	.add(Restrictions.gt("spercentage", session.createCriteria(Student.class)
    	.setProjection(Projections.min("spercentage")).uniqueResult()))
    	.setProjection(Projections.min("spercentage")).uniqueResult()))
    	.list();
    	
    	list.forEach(s->System.out.println(s));
    	*/
//    	-----------------------------------------------
    	//display 3rd max percentage
    	//there can be multiple records for the same percentage so list is used
    	/*
    	List<Student> list = session.createCriteria(Student.class)
    	.add(Restrictions.eq("spercentage", session.createCriteria(Student.class)
    	.add(Restrictions.lt("spercentage", session.createCriteria(Student.class)
    	.add(Restrictions.lt("spercentage", session.createCriteria(Student.class)
    	.setProjection(Projections.max("spercentage")).uniqueResult()))
    	.setProjection(Projections.max("spercentage")).uniqueResult()))
    	.setProjection(Projections.max("spercentage")).uniqueResult()))
    	.list();
    	
    	list.forEach(s->System.out.println(s));
    	*/
//    	-----------------------------------------------
    	//display 3rd min percentage
    	//there can be multiple record for the same percentage
    	/*
    	List<Student> list = session.createCriteria(Student.class)
    	.add(Restrictions.eq("spercentage", session.createCriteria(Student.class)
    	.add(Restrictions.gt("spercentage", session.createCriteria(Student.class)
    	.add(Restrictions.gt("spercentage", session.createCriteria(Student.class)
    	.setProjection(Projections.min("spercentage")).uniqueResult()))
    	.setProjection(Projections.min("spercentage")).uniqueResult()))
    	.setProjection(Projections.min("spercentage")).uniqueResult()))
    	.list();
    	
    	list.forEach(s->System.out.println(s));
    	*/s
    	
    	tx.commit();
    	session.close();
    	
    }
}
