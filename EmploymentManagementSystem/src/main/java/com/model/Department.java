package com.model;

public class Department {
private int DeptId;
private String DeptName;
public int getDeptId() {
	return DeptId;
}
public void setDeptId(int deptId) {
	DeptId = deptId;
}
public String getDeptName() {
	return DeptName;
}
public void setDeptName(String deptName) {
	DeptName = deptName;
}
@Override
public String toString() {
	return "Department [DeptId=" + DeptId + ", DeptName=" + DeptName + "]";
}

}
