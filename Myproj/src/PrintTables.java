import java.util.Scanner;

public class PrintTables {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number to print Tables ");
		int n = s.nextInt();
		int t=1;
		for(int i=1;i<=n;i++) {
			System.out.println("Table of "+"'"+i+"'");
			for (int j=1;j<=10;j++) {
				t = i*j;
				System.out.println(i+"*"+j+"="+t);
			}
			System.out.println(" ");
			
		}
		

	}

}
