package programss;

import java.util.Arrays;

public class Prog {
	public static void main(String[] args) {
		int a[] = { 30,11,15,12,11,3, 50, 10, 80, 20, 60, 40, 90, 70, 100 };
		for (int i = 0; i <= a.length - 1; i++) {
			for (int j = i; j <= a.length - 2; j++)
				if (a[i] > a[j + 1]) {
					int temp = a[i];
					a[i] = a[j + 1];
					a[j + 1] = temp;
				}
		}
		int last = a.length - 1;
		for (int i = a.length / 2; i <= (a.length*2)/3; i++)
		{
			int temp1 = a[i];
			a[i] = a[last];
			a[last] = temp1;
			last--;
		}

		System.out.println(Arrays.toString(a));

	}
}
