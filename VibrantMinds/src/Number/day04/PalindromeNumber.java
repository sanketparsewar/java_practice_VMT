//Wap to check number given is palindrome or not

package Number.day04;

public class PalindromeNumber {
	public static void main(String[] args) {
		int n = 12321, sum = 0, temp = n;

		while (temp != 0) {
			sum *= 10;
			sum += temp % 10;
			temp /= 10;
		}
		System.out.println((n == sum) ? n + " is palindrome" : n + " Not palindrome");
	}
}

//Wap to find 81th palindrome number
//Wap to find display first 25 palindrome number in reverse order