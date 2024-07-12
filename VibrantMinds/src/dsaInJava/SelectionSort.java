package dsaInJava;

import java.util.Arrays;

public class SelectionSort {
	public static void main(String[] args) {
		int a[] = {98, 5,3, 2, 1, 55, 6, 9, 4, 5, 7 };
		for (int i = 0; i < a.length; i++) {
			int s = i;
			for (int j = i; j < a.length; j++) {
				if (a[j] < a[s])
					s = j;
			}
			int temp = a[i];
			a[i] = a[s];
			a[s] = temp;
		}
		System.out.println(Arrays.toString(a));
	}
}
