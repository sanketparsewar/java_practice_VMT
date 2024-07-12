package arrays.day02;

import java.util.Arrays;

public class ShiftLastToFirstWithoutTemp {

	public static void main(String[] args) {
		int a[] = { 10, 20, 30, 40, 50 };
		for (int i = a.length - 1; i > 0; i--) {
			int temp = a[i];
			a[i] = a[i - 1];
			a[i - 1] = temp;
		}
		System.out.println(Arrays.toString(a));
	}

}
