import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number to find its factorial ");
		int n = s.nextInt();
		int fact = 1;
		for (int i = n; i >= 1; i--) {
			fact = fact * i;
		}
		System.out.println("Factorial of " + n + " is " + fact);

	}

}


//recursion


//public class Factorial {
//	public static int fact(int n) {
//		if (n == 1) {
//			return 1;
//		} else {
//			return (n * fact(n - 1));
//		}
//	}
//
//	public static void main(String[] args) {
//		int i;
//		i = 7;
//		System.out.println(fact(i));
//	}
//}
