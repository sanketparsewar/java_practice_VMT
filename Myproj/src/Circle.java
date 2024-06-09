import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter radius ");
		float r = s.nextFloat();
		float pi=3.142f;
		float area = pi * r * r;
		System.out.println("Area of circle is = "+ area);

	}

}
