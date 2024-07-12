package com.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.model.Student;

public class App 
{
    public static void main( String[] args )
    { 
        Configuration con= new Configuration().configure();
        SessionFactory sf=con.buildSessionFactory();
        Session session =sf.openSession();
        Transaction tx=session.beginTransaction();
        Student s1=new Student();
        s1.setSname("Sanket");
        s1.setScity("Pune");
        s1.setSpercentage(93.4);
        System.out.println(session.save(s1));
        
        Student s2=new Student();
        s2.setSid(3);
        session.delete(s2);
        
        
        
        tx.commit();
        session.close();
        
        
        
    }
}
