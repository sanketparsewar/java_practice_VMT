import java.util.Scanner;

public class EnterZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int sum = 0;
		int n;
		do {
			System.out.println("Enter number to stop enter Zero(0) ");
			n = s.nextInt();
			sum += n;
		} while (n != 0);
		System.out.println("Sum is " + sum);

	}

}
