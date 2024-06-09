package arrays.day03;

import java.util.Arrays;

public class ArrayQuestion2 {
	public static void main(String[] args) {
		int a[] = { 15, 16, 18, 28, 38, 24, 32, 30, 42, 36 };
		for (int i = 0; i < a.length; i++) {
			a[i] = (a[i] % 4 == 0) ? (a[i] % 6 == 0) ? -3 : -1 : (a[i] % 6 == 0) ? -2 : a[i];
		}
		System.out.println(Arrays.toString(a));
	}
}
