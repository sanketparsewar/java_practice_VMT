package arrays.day03;

public class TwoConsecutiveNo {
	public static void main(String[] args) {
		int a[] = { 343, 11, 12, 49,15,14,15,31,13,10,11,16 };
		for (int i = 0; i <= a.length - 1; i++) {
			int temp = a[i]+1;
			for (int j = i + 1; j <= a.length - 1; j++) {
				if (a[j] == temp) {
					System.out.println(a[i] + " " + a[j]);
					break;
				}
			}
		}
	}
}
