package arrays.day03;

import java.util.Arrays;

public class AppendSerialnoAtFirst {
	public static void main(String[] args) {
		int a[] = { 10, 23, 121, 2323, 123, 13, 4, 4, 21, 1, 21, 32 };
		int count = 1;
		for (int i = 0; i < a.length; i++) {
			int temp = a[i], len = 0;
			while (temp != 0) {
				temp /= 10;
				len++;
			}
			int sum = count;
			sum *= Math.pow(10, len);
			a[i] += sum;
			count++;
		}
		System.out.println(Arrays.toString(a));
	}
}
