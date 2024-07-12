package com.demo;

import java.util.List;

import com.dao.StudentDao;
import com.dao.StudentDao2;
import com.model.Student;

public class App {	
	public static void main(String[] args) {
		StudentDao2 sd=new StudentDao2();
//-----------------------------		
		Student s1= new Student();
		s1.setSid(5);
		s1.setSname("pande");
		s1.setScity("Ansia");
		s1.setSphone("8237821456");
//		System.out.println(sd.insertStudent(s1));    //insert data
		System.out.println(sd.deleteStudent(1));
//		-------------------------------
//		System.out.println(sd.deleteStudentBySid(4));   // delete record
//		-------------------------------
//		Student s =sd.findStudentBySid(2);      //find record     
//		System.out.println(s);
//		---------------------------------
		
//		List<Student> list=sd.findAllStudent();    //find all record
//		for(Student s:list)
//			System.out.println(s);
//		-----------------------------------
//		System.out.println(sd.findStudentBySid(2));    //update record
//		Student s=sd.findStudentBySid(2);
//		s.setSname("Sanket");
//		System.out.println(sd.updateStudent(s));
//		System.out.println(sd.findStudentBySid(2));
			
	}
}
