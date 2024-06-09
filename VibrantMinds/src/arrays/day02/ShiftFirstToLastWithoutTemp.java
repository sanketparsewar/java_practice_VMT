package arrays.day02;

import java.util.Arrays;

public class ShiftFirstToLastWithoutTemp {

	public static void main(String[] args) {
		int a[] = { 10, 20, 30, 40, 50 };
		for (int i = 0; i <= a.length - 2; i++) {
			a[i] += a[i + 1];
			a[i + 1] = a[i] - a[i + 1];
			a[i] += -a[i + 1];
		}
		System.out.println(Arrays.toString(a));

	}

}
