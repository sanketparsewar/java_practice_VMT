import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.println("Enter numeber to get table ");
		int  n = s.nextInt();
		for (int i=1;i<=10;i++) {
			int t;
			t=n*i;
			System.out.println(n+"*"+i+"="+t);
		}
		

	}

}
