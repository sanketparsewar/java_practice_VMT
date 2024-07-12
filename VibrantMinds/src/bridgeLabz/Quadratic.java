package bridgeLabz;

import java.util.Scanner;

public class Quadratic {
	public static void main(String[] args) {
		System.out.println("The quadratic equation is  a*x*x + b*x + c");
		System.out.println("To find the roots enter the values.");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter value of a: ");
		float a = sc.nextInt();
		System.out.print("Enter value of b: ");
		float b = sc.nextInt();
		System.out.print("Enter value of c: ");
		float c = sc.nextInt();
		float delta = (b * b) - (4 * a * c);
		System.out.println("Root 1 of x =" + (-b + Math.sqrt(delta)) / (2 * a));
		System.out.println("Root 2 of x =" + (-b - Math.sqrt(delta)) / (2 * a));
	}
}
