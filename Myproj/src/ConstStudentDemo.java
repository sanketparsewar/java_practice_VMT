class Student1 {
	int rollNum;
	String studName;
	int mark1;
	int mark2;
	int mark3;
	int totalMarks;

	Student1(int rollNum, String stuName, int mark1, int mark2, int mark3) {
		totalMarks = 0;
		this.rollNum = rollNum;
		this.studName = stuName;
		this.mark1 = mark1;
		this.mark2 = mark2;
		this.mark3 = mark3;
	}

	void calculateTotal() {
		totalMarks = mark1 + mark2 + mark3;

	}

	void displayStuDetails() {
		System.out.println("Roll no. = " + rollNum);
		System.out.println("Student Name = " + studName);
		calculateTotal();
		System.out.println("Total Marks = " + totalMarks);
	}
}

public class ConstStudentDemo {

	public static void main(String[] args) {
		Student1 s1 = new Student1(2, "Sanket", 6, 8, 9);
		s1.displayStuDetails();
		Student1 s2 = new Student1(3, "Vaibhav", 7, 9, 8);
		s2.displayStuDetails();

	}

}
