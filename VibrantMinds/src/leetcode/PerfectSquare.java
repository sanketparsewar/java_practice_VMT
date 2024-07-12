//Perfect Squares
//Given an integer n, return the least number of perfect square numbers that sum to n.
//A perfect square is an integer that is the square of an integer; in other words, 
//it is the product of some integer with itself. For example, 1, 4, 9, and 16 are perfect squares 
//while 3 and 11 are not.

package leetcode;

public class PerfectSquare {
	public static int numSquares(int n) {
		int sum = 0;
		for (int i = 2; i <= n; i++) {
			if (Math.sqrt(i) % 1 == 0) {
				System.out.println(i);
				sum = sum + i;
			}
		}
		return n;

	}

	public static void main(String[] args) {
		System.out.println(numSquares(12));
	}
}
