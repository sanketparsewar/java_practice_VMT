package pattern;

import java.util.Scanner;

public class Counter4 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the value:");
			int n = sc.nextInt();
			int count = 1;
			for (int i = n; i >= 1; i--) {
				int c = count;
				for (int j = n; j >= i; j--) {
					System.out.print(c + "\t");
					c += j - 1;
				}
				System.out.println();
				count++;
			}
		}

	}
}
