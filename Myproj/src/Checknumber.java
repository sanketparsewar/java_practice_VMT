import java.util.Scanner;

public class Checknumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number ");
		float n = s.nextFloat();
		if (n > 0) {
			System.out.println(n + " is Positive");
		} 
		else if (n < 0) {
			System.out.println(n + " is Negative");
		} 
		else {
			System.out.println(n + " is Zero");
		}
	}
}
