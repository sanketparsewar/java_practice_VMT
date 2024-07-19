package com.demo;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.model.Gift;
import com.model.Laptop;
import com.model.Student;
import com.utils.HBUtils;


public class App {
	public static void main(String[] args) {

		Session session = HBUtils.sf.openSession();
		Transaction tx = session.beginTransaction();
		
		//add the multiple records in student table
				/*
				String name[]= {"ABC","DEF","GHI","JKL","MNO","PQR","STU","VWX"};
				String city[]= {"pune","Delhi","mumbai","nagpur","akola","nanded","sangli","jalgaon"};
				double perecentage[]= {71.23,64.33,58.12,89.22,98.44,76.21,61.11,82.32};
				for(int i=1;i<=name.length;i++)
				{
					Student s= new Student();
					s.setSname(name[i-1]);
					s.setScity(city[i-1]);
					s.setSpercentage(perecentage[i-1]);
					session.save(s);
				}
				*/
		
		//ad  the multiple record in the table a time
		/*
		String lapname[]= {"dell","hp","sony","asus","samsung","apple","nokia"};
		double lapprice[]= {12000.00,16000.00,21000.00,1800000,20000.00,14000.00,24000.00};
		
		for(int i=1;i<=lapname.length;i++)
		{
			Laptop lp=new Laptop();
			lp.setLname(lapname[i-1]);
			lp.setLprice(lapprice[i-1]);
			session.save(lp);
		}
		*/
		
		//add the multiple record in the gift table
		/*
		String gname[]= {"watch","pen","books","shirt","pant","wallet","carrom board","chess board","shoes","cycle","compass","bag","hedphones","sweet box","water bottle","lunch box","keyboard and mouse","perfume","pecnil","pendrive"};
		String gtype[]= {"fashion","study","study","fashion","fashion","fashion","games","games","fashion","vehicle","study","study","accessories","food","accessories","accessories","accessories","fashion","study","accessories"};
		System.out.println(gname.length+","+gtype.length);
		for(int i=1;i<=gname.length;i++)
		{
			Gift g= new Gift();
			g.setGname(gname[i-1]);
			g.setGtype(gtype[i-1]);
			session.save(g);
		}
		*/
		
		//this is used for entering the values that is the foreign key column in the last column of both table 
		/*
		Student s1= session.get(Student.class, 8);
		Laptop l1= session.get(Laptop.class,4);
		s1.setLaptop(l1);
		l1.setStudent(s1);
		*/
		
		//connecting both tables by adding the records of foreign key in both the tables
		/*
		int a[]= {7,1,5,3,1,4,1,6,1,4,6,3,2,4,5,7,2,8,3,8};
	
		for(int i=1;i<=20;i++)
		{
			Gift g=session.get(Gift.class, i);
			Student s= session.get(Student.class, a[i-1]);
			g.setStudent(s);
		}
		*/
		
		
		Student s1= session.get(Student.class,4);
		System.out.println(s1);
		for(Gift g:s1.getGifts())
			System.out.println(g);
		
		
		
		
		
		
		
		tx.commit();
		session.close();
	}
}
