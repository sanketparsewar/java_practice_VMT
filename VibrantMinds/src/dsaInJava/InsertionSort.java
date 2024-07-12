package dsaInJava;

import java.util.Arrays;

public class InsertionSort {
	public static void main(String[] args) {
		int a[] = { 20,60,80,50,70,90,10,40,30,};
		for (int i = 0; i < a.length; i++) {
			for (int j = i; j > 0; j--) { 
				if (a[j] < a[j - 1]) { 
					a[j] += a[j - 1]; 
					a[j - 1] = a[j] - a[j - 1];
					a[j] -= a[j - 1];
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}
}
