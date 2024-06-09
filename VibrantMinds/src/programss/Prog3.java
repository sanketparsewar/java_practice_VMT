//linear search
package programss;

public class Prog3 {
	public static void main(String[] args) {
		int a[] = { 10, 43, 23, 1, 34, 2, 4, 8 };
		int n = 100;
		int index = -1;
		for (int i = 0; i <= a.length - 1; i++) {
			if (n == a[i]) {
				index = i;
				break;
			}

		}
		if (index >= 0)
			System.out.println("Element " + n + " is index " + index);
		else
			System.out.println("Element " + n + " is not present so " + index);
	}
}
