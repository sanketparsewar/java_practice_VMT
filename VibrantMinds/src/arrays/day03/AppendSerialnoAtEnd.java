package arrays.day03;

import java.util.Arrays;

public class AppendSerialnoAtEnd {
	public static void main(String[] args) {
		int a[] = { 10, 20, 304, 45, 34, 10, 23, 45, 23, 1, 434, 222 };
		int count = 1;
		for (int i = a.length - 1; i >= 0; i--) {
			int temp = count, length = 0;
			while (temp != 0) {
				temp /= 10;
				length++;
			}
			a[i] *= (int) Math.pow(10, length);
			a[i] += count;
			count++;
		}
		System.out.println(Arrays.toString(a));
	}
}
