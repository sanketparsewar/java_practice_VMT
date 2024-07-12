package dsaInJava;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		int a[] = { 5, 8, 2, 9, 5, 2, 6, 7, 4, 0, 1 };
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length - 1 - i; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));

	}
}