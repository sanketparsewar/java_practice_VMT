package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Laptop {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int lid;
	private String lname;
	private double lprice;
	@OneToOne
	private Student student;
	
	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public int getLid() {
		return lid;
	}

	public void setLid(int lid) {
		this.lid = lid;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public double getLprice() {
		return lprice;
	}

	public void setLprice(double lprice) {
		this.lprice = lprice;
	}

	@Override
	public String toString() {
		return "Laptop [lid=" + lid + ", lname=" + lname + ", lprice=" + lprice + "]";
	}

}
