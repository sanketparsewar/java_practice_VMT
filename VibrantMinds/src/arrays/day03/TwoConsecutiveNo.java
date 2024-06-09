package arrays.day03;

public class TwoConsecutiveNo {
	public static void main(String[] args) {
		int a[] = { 10, 6, 13, 14, 18, 21, 22, 23, 24, 18, 19, 30, 10, 11, 2, 23, 343, 11, 12, 49, 31 };
		for (int i = 0; i <= a.length - 1; i++) {
			int temp = a[i];
			for (int j = i + 1; j <= a.length - 1; j++) {
				if (a[j] == ++temp) {
					System.out.println(a[i] + " " + a[j]);
					break;
				}
			}
		}
	}
}
