package programss;

public class CheckPerfectSquare {
	public static void main(String[] args) {
		int a[] = { 64, 1, 22, 323, 144, 655, 625, 23, 121, 144 };
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j <= a[i]; j++) {
				if (j * j == a[i]) {
					System.out.println(a[i] + " is square of " + j);
					break;
				} else if (j == a[i])
					System.out.println(a[i] + " is not a perfect square");
			}
		}
	}
}