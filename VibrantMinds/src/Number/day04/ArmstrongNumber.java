//WAp to find 16th armstrong number
package Number.day04;

public class ArmstrongNumber {
	private void armstrongn(int n1) {
		int n = Integer.MAX_VALUE;
		int count = 1;
		for (int i = 1; i < n; i++) {
			int temp = i, sum = 0, lenght = 0;
			while (temp != 0) {
				temp /= 10;
				lenght++;
			}
			temp = i;
			while (temp != 0) {
				sum += Math.pow(temp % 10, lenght);
				temp /= 10;
			}
			if (sum == i) {
				if (count == n1) {
					System.out.println(i);
					break;
				}
				count++;
			}
		}
	}

	void Armstrong(int n) {
		for (int i = 1; i < n; i++) {
			int temp = i, length = 0, sum = 0;
			while (temp != 0) {
				temp /= 10;
				length++;
			}
			temp = i;
			while (temp != 0) {
				sum += Math.pow(temp % 10, length);
				temp /= 10;
			}
			if (i == sum)
				System.out.println(i + " is armstrong");
		}

	}

	public static void main(String[] args) {
		ArmstrongNumber as = new ArmstrongNumber();
		as.Armstrong(1000);
		as.armstrongn(10);
	}
}
