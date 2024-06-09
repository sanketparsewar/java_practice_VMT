import java.util.Scanner;

public class BigNum {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter three numbers ");
		int n1 = s.nextInt();
		int n2 = s.nextInt();
		int n3 = s.nextInt();
		System.out.println((n1>n2 && n1>n3) ? (n1+" is big") : ((n2>n3)?(n2+" is big") : (n3+" is big")));
	}
}