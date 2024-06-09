//WAP to Find 52th perfect Square
//WAP to display first 35 Perfect Square number in reverse order

package Number.day04;

public class PerfectSquare {
	private void pSquare52() {
		int n = Integer.MAX_VALUE;
		int count = 0;
		for (int i = 1; i <= n; i++) {
			if (Math.sqrt(i) % 1 == 0) {

				if (count == 52) {
					System.out.println(i);
					break;
				}
				count++;
			}
		}
	}

	private void checkSquare(int n) {
		int count = 0;
		for (int i = 1; i < n; i++)
			if (Math.sqrt(i) % 1 == 0) {
				System.out.println(i + " is perfect Square");
				count++;
			}
		System.out.println(count);
	}

	private void pSquareReverse35() {
		int n = Integer.MAX_VALUE;
		int a[] = new int[35];
		int index = 0;
		for (int i = 1; i <= n; i++) {
			if (Math.sqrt(i) % 1 == 0) {
				if (index != 35) {
					a[index] = i;
					index++;
				} else
					break;
			}
		}
		for (int i = a.length - 1; i >= 0; i--) {
			System.out.println(a[i]);
		}
	}

	public static void main(String[] args) {

		PerfectSquare ps = new PerfectSquare();
		ps.checkSquare(100);
		ps.pSquare52();
		ps.pSquareReverse35();
	}
}
