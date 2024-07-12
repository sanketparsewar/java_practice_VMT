

package com.model;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

//entity class is refer as table
@Entity      
//@Table(name = "t1")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	@Column(name = "t1_id",columnDefinition = "int(10)")
	private int sid;
	
//	this annotation is used to have user defined column
//	@Column(name = "t1_name",columnDefinition = "varchar(25)")
	private String sname;
	
//	this is used to skip that column means no need to store that column
//	@Transient
	private String scity;
	@Column(columnDefinition = "double(5,2)")
	private double spercentage;
	private long sphone;
//	This is written to define that address class is embedded in student class
//	so that this address will be the part of student table
	@Embedded
	private Address address;
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getScity() {
		return scity;
	}
	public void setScity(String scity) {
		this.scity = scity;
	}
	public double getSpercentage() {
		return spercentage;
	}
	public void setSpercentage(double spercentage) {
		this.spercentage = spercentage;
	}
	public long getSphone() {
		return sphone;
	}
	public void setSphone(long sphone) {
		this.sphone = sphone;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", scity=" + scity + ", spercentage=" + spercentage
				+ ", sphone=" + sphone + ", address=" + address + "]";
	}
}
