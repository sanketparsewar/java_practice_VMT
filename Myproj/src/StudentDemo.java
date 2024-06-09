class Student{
	int rollNum;
	String studName;
	int mark1;
	int mark2;
	int mark3;
	int totalMarks;

	void setStudDetails(int rollNum, String studName, int mark1, int mark2, int mark3) {
		this.rollNum = rollNum;
		this.studName = studName;
		this.mark1 = mark1;
		this.mark2 = mark2;
		this.mark3 = mark3;
	}

	void calculateTotal() {
		totalMarks = mark1 + mark2 + mark3;
	}

	void displayStudDetails() {
		System.out.println("RollNO.= " + rollNum);
		System.out.println("Name= " + studName);
		System.out.println("Total marks= " + totalMarks);
	}

}

public class StudentDemo{
		public static void main(String[] args) {
			Student s = new Student();
			s.setStudDetails(10, "Sanket", 8, 5, 9);
			s.calculateTotal();
			s.displayStudDetails();
			System.out.println("");
			s.setStudDetails(15, "vaibhav", 7, 6, 8);
			s.calculateTotal();
			s.displayStudDetails();
		}
	}