package com.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import com.dao.EmployeeDao;
import com.model.Employee;

public class App {
	public static void main(String[] args) {
		
//		this code is used for inserting the data in table
		/*
		EmployeeDao ed = new EmployeeDao();
		Employee e = new Employee();
		e.setEFname("Sanket");
		e.setELname("Parsewar");
		e.setEAddress("Nanded");
		e.setEDesignation("Developer");
		e.setEPhone_no("8833002255");
		e.setESalary(455566);
		System.out.println(ed.insertEmployee(e));
		*/
		
//		this code is used for delete the record from table
		/*
		EmployeeDao ed= new EmployeeDao();
		System.out.println(ed.deleteEmployeeByEId(5));
		*/
		
//		this code is used for displaying the data from table		
		/*
		EmployeeDao ed= new EmployeeDao();
		System.out.println(ed.findEmployeeByEid(4));
		*/
		
//		this code is used for displaying all records from table
		/*
		EmployeeDao ed= new EmployeeDao();
		List<Employee> list=ed.findAllEmployee();
		for(Employee e1:list)
			System.out.println(e1);
		*/
		
//		this code is used for updating the record of table
		/*
		EmployeeDao ed=new EmployeeDao();
		Employee e= ed.findEmployeeByEid(2);
		e.setEFname("Sumanth");
		e.setELname("Bodhan");
		e.setEDesignation("SQL Developer");
		System.out.println(ed.updateEmployeeByEid(e));
		*/
		
		//This code is used for entering random data in dataset
		/*
		EmployeeDao ed=new EmployeeDao();
		for (int i = 1; i <= 5; i++) {
			Employee e = new Employee();
			StringBuilder EFname = new StringBuilder();
			StringBuilder ELname = new StringBuilder();

			StringBuilder EDesignation = new StringBuilder();
			StringBuilder EPhone_no = new StringBuilder();
			StringBuilder EAddress = new StringBuilder();
			for (int j = 1; j <= 10; j++) {
				EFname.append((char) (new Random().nextInt(26) + 65));
				ELname.append((char) (new Random().nextInt(26) + 65));
				EDesignation.append((char) (new Random().nextInt(26) + 65));
				EPhone_no.append((new Random().nextInt(10)));
				EAddress.append((char) (new Random().nextInt(26) + 65));
			}
			e.setEFname(EFname.toString());
			e.setELname(ELname.toString());
			e.setEDesignation(EDesignation.toString());
			e.setEPhone_no(EPhone_no.toString());
			e.setEAddress(EAddress.toString());
			e.setESalary(new Random().nextDouble() * 1000000);
			ed.insertEmployee(e);
		}
		*/
		
//		this code is used for display the record from table EFname
		/*
		EmployeeDao ed= new EmployeeDao();
		List<Employee> list= ed.findEployeeByEFname("NSIGHWWGBY");
		for(Employee e:list)
			System.out.println(e);
		*/

//		this code is used for display the record from table EFname and EDesignation
		/*
		EmployeeDao ed= new EmployeeDao();
		List<Employee> list = ed.findEmployeeByEFnameAndEDesignation("JLIUUQTFLL", "JLVWVRPUPS");
		for(Employee e:list)
			System.out.println(e);
		*/
		
//		This code is used for display the record from table EFname or EDesignation
		/*
		EmployeeDao ed = new EmployeeDao();
		List<Employee> list = ed.findEmployeeByEFnameOrEDesignation("JLIUUQTFLL", "KYTWVIFZPY");
		for(Employee e:list)
			System.out.println(e);
		*/
		
		
//		this is code is usedd for display the record from the table less than the input salary
		/*
		EmployeeDao ed=new EmployeeDao();
		List<Employee> list =ed.findEmployeeBySalaryLessThan(5000);
		for(Employee e:list)
			System.out.println(e);
		*/
		
//		this is code is used for displaying the records from the table greater than the input salary
		/*
		EmployeeDao ed=new EmployeeDao();
		List<Employee> list =ed.findEmployeeBySalaryGreaterThan(800000);
		for(Employee e:list)
			System.out.println(e);
		 */
		
//		this code is used for display the records from the table equal to given salary
		/*
		EmployeeDao ed= new EmployeeDao();
		List<Employee> list =ed.findEmployeeBySalaryEqualTo(753035.09);
		for(Employee e:list)
			System.out.println(e);
		*/	
		
//		this code is used for displaying the records from the table ESalary between range
		/*
		EmployeeDao ed= new EmployeeDao();
		List<Employee> list = ed.findEmployeeBySalaryBetween(5000, 10000);
		for(Employee e:list)
			System.out.println(e);
		*/
		
//		this is code is used for displaying the records from the table using EFname 
		/*
		for(Employee e:new EmployeeDao().findEmployeeByEFnameLike("V"))
			System.out.println(e);
		*/
		
//		this code is used for displaying the records from the table Employee using In for EId
		/*
		List<Integer> id=new ArrayList<>();
		id.add(1);
		id.add(2);
		id.add(4);
		id.add(5);
		id.add(6);
		id.add(7);
		for(Employee e:new EmployeeDao().findEmployeeByEIdIn(id))
			System.out.println(e);
		*/
		
		EmployeeDao ed= new EmployeeDao();
		Map<String,List> m =ed.findEFnameAndESalary();
		for(int i=0;i<m.get("listOfEFnames").size();i++) {
			System.out.println(m.get("listOfEFnames").get(i)+"\t\t"+m.get("listOFESalary").get(i));
		}
		
		
		
		
	}
}
