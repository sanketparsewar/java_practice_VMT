import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter two numbers ");
		int n1 = s.nextInt();
		int n2 = s.nextInt();
		System.out.println("1.Add");
		System.out.println("2.Subtract");
		System.out.println("3.Multiply");
		System.out.println("4.Divide");
		double result = 0;
		int ch = s.nextInt();
		switch (ch) {
		case 1:
			result = n1 + n2;
			break;
		case 2:
			result = n1 - n2;
			break;
		case 3:
			result = n1 * n2;
			break;
		case 4:
			result = n1 / n2;
			break;
		default:
			System.out.println("Invalid input");
			System.exit(0);
			break;
		}
		System.out.println("Result = "+result);
		// TODO Auto-generated method stub

	}

}
