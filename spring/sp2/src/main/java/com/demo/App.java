package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.Student;

public class App {
	public static void main(String[] args) {
		//creating object directly is known as tightly couple
		/*
		Student s1 = new Student();
		System.out.println(s1);
		*/
		
		
		//application context is nothing but the spring container containing bean objects
		//ClassPathXmlApplicationConteext processed the bean.xml and creates the bean objects
		//calling the student object by type as Student.class because there is only on bean object in xml file
		//if there are multiple bean objects in xml file the call by name
		
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		Student s1= context.getBean("s1",Student.class);
		System.out.println(s1);
		
		//calling the bean object by name
		Student s2 = context.getBean("s2",Student.class);
		System.out.println(s2);
		
		
		//by default spring framework create object once so less memory is utilized
		//by default object creation is singleton
		//scope is singleton
		/*
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		Student s1= context.getBean(Student.class);
		Student s2= context.getBean(Student.class);
		System.out.println(s1==s2);
		*/
		
		//now here the scope of bean object is set as prototype
		//means now the object created are different
		/*
		ApplicationContext context= new ClassPathXmlApplicationContext("bean.xml");
		Student s1= context.getBean(Student.class);
		Student s2 = context.getBean(Student.class);
		System.out.println(s1==s2);
		*/	
		
		
	}
}
