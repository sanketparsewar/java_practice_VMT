//	    1
//	   2 2
//	  3 3 3
//	 4 4 4 4 

import java.util.Scanner;

public class NumTriangle {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number");
		int n = s.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			for (int k = i; k <= i; k++) {
				for (int l = 1; l <= k; l++) {
					System.out.print(k + " ");
				}
				System.out.println(" ");
			}
		}
	}
}
