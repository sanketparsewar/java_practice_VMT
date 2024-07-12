package com.model;

public class Student {
	private int Sid;
	private String Sname;
	private String Scity;
	private String Sphone;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Student [Sid=" + Sid + ", Sname=" + Sname + ", Scity=" + Scity + ", Sphone=" + Sphone + "]";
	}

	public int getSid() {
		return Sid;
	}

	public void setSid(int sid) {
		Sid = sid;
	}

	public String getSname() {
		return Sname;
	}

	public void setSname(String sname) {
		Sname = sname;
	}

	public String getScity() {
		return Scity;
	}

	public void setScity(String scity) {
		Scity = scity;
	}

	public String getSphone() {
		return Sphone;
	}

	public void setSphone(String sphone) {
		Sphone = sphone;
	}
}
