//Wap to find 82th perfect cube
//Wap to display first 25 perfect Cube number in reverse order 

package Number.day04;

public class PerfectCube {
	private void pCube82() {
		int n = Integer.MAX_VALUE;
		int count = 0;
		for (int i = 1; i <= n; i++) {
			if (Math.cbrt(i) % 1 == 0) {
				if (count == 82) {
					System.out.println(i);
					break;
				}
				count++;
			}
		}
	}

	private void pCubeReverse25() {
		int n = Integer.MAX_VALUE;
		int a[] = new int[25];
		int index = 0;
		for (int i = 1; i <= n; i++) {
			if (Math.cbrt(i) % 1 == 0) {
				if (index != 25) {
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

	private void pCube(int n) {
		for (int i = 1; i <= n; i++) {
			if (Math.cbrt(i) % 1 == 0) {
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {
		PerfectCube pc = new PerfectCube();
		pc.pCube(100);
		pc.pCube82();
		pc.pCubeReverse25();
	}
}
