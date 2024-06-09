//A palindromic prime is a number that is simultaneously palindromic and prime. 
//The first few (base-10) palindromic primes are 2, 3, 5, 7, 11, 101, 131, 151, 181, 191, 313, 353

package programss;

public class CheckPalindromicPrime {
	public static void main(String[] args) {
		int n = 500;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				if (j == i) {
					int temp = i, sum = 0, num = 0;
					while (temp != 0) {
						sum *= 10;
						num = temp % 10;
						sum += num;
						temp /= 10;
					}
					if (sum == i) {
						System.out.println(i);
						break;
					}
//					else
//						System.out.println(i + " is not palindromic prime");

				}

				else if (j != 1 && i % j == 0) {
//					System.out.println(i + " is Not palindromic prime");
					break;
				}
			}
		}
	}
}
