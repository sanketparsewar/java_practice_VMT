//Plus One
//You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. 
//The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.
//Increment the large integer by one and return the resulting array of digits.
package leetcode;

import java.util.Arrays;

public class PlusOne {
	public int[] plusOne(int[] digits) {
//		String strNum = "";
//		for (int i = 0; i <= digits.length - 1; i++) {
//			String num = String.valueOf(digits[i]);
//			strNum += num;
//		}
////		System.out.println(strNum.indexOf("9"));
//		Long number = Long.parseLong(strNum);
//		number += 1;
//		char c[] = String.valueOf(number).toCharArray();
//		int d[] = new int[c.length];
//		for (int i = 0; i <= c.length - 1; i++) {
//			d[i] = Integer.parseInt(String.valueOf(c[i]));
//		}
//		digits = d.clone();
//
//		return digits;
		int n = digits.length;
        for (int i = n - 1; i >= 0; --i) {
            ++digits[i];
            System.out.println(digits[i]);
            digits[i] %= 10;
            if (digits[i] != 0) {
                return digits;
            }
        }
        digits = new int[n + 1];
        digits[0] = 1;
        return digits;
	}

	public static void main(String[] args) {
		PlusOne po = new PlusOne();
//		int[] digits = {7,2,8,5,0,9,1,2,9,5,3,6,6,7,3,2,8,4,3,7,9,5,7,7,4,7,4,9,4,7,0,1,1,1,4,7,0,1,1,1,7,4,0,0,9 };
		int[] digits = {9,9};
		digits = po.plusOne(digits);
		System.out.println(Arrays.toString(digits));
	}
}
