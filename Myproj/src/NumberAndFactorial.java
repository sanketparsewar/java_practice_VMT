import java.util.Scanner;

public class NumberAndFactorial {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.println("Enter number ");
		int n =s.nextInt();
		int sum=0;
		System.out.println("--------------------------");
		System.out.println("    Number    Factorial   ");
		System.out.println("--------------------------");
		for (int i=1;i<=n;i++) {
			System.out.println("      "+i+"           "+fact(i));
			sum=sum+fact(i);
		}
		System.out.println("--------------------------");
		System.out.println("     sum" +"          "+    sum);
		System.out.println("--------------------------");

	}
	public static int fact(int f) {
		if (f==1) {
			return 1;
		}
		else {
			int fa;
			fa=f * fact(f-1);
			return fa;
		}
	}

}
