class Employee{
	int empNum;
	String empName;
	double empSalary;
	
	void setEmpDetails(int empNum, String empName, double empSalary){
		this.empNum=empNum;
		this.empName=empName;
		this.empSalary=empSalary;
		
	}
	void dispEmpDetails(){
		System.out.println("EmpNum="+empNum);
		System.out.println("EmpName="+empName);
		System.out.println("EmpSalary="+empSalary);
	}
}
public class EmployeeTest {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.setEmpDetails(111,"Raj",500);
		e1.dispEmpDetails();
//		Employee e2 = new Employee();
//		e2.setEmpDetails();		
//		e2.dispEmpDetails();
	}

}
