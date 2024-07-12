package com.model;

public class Employee {
private int EId;
private String EFname;
private String ELname;
private String EDesignation;
private String EPhone_no;
private String EAddress;
private double ESalary ;
public int getEId() {
	return EId;
}
public void setEId(int eid) {
	EId = eid;
}
public String getEFname() {
	return EFname;
}
public void setEFname(String eFname) {
	EFname = eFname;
}
public String getELname() {
	return ELname;
}
public void setELname(String eLname) {
	ELname = eLname;
}
public String getEDesignation() {
	return EDesignation;
}
public void setEDesignation(String eDesignation) {
	EDesignation = eDesignation;
}
public String getEPhone_no() {
	return EPhone_no;
}
public void setEPhone_no(String ePhone_no) {
	EPhone_no = ePhone_no;
}
public String getEAddress() {
	return EAddress;
}
public void setEAddress(String eAddress) {
	EAddress = eAddress;
}
public double getESalary() {
	return ESalary;
}
public void setESalary(double eSalary) {
	ESalary = eSalary;
}
@Override
public String toString() {
	return "Employee [EId=" + EId + ", EFname=" + EFname + ", ELname=" + ELname + ", EDesignation=" + EDesignation
			+ ", EPhone_no=" + EPhone_no + ", EAddress=" + EAddress + ", ESalary=" + ESalary + "]";
}


}
