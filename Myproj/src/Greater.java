import java.util.Scanner;

public class Greater {

	public static void main(String[] args) {
		Scanner	s = new Scanner(System.in);
		int i=0;
		int big=0;
		while(i<10) {
			System.out.println("Enter number");
			int n = s.nextInt();
			if (n > big) {
				big = n;
			}
			i++;
		}
		System.out.println("Big number is:"+big);
		
	}

}
