package programss;

import java.util.Arrays;

public class CheckPalindrome {
	public static void main(String[] args) {
		Object a[] = {21, 101,6776, 141, 4, 78987, 3212, 22, 242 };
		for (int i = 0; i < a.length; i++) {
			int sum = 0, num = 0, temp = (int)a[i];
			while (temp != 0) {
				sum *= 10;//10
				num = temp % 10; //num=2
				temp /= 10; //temp=0
				sum += num;//sum=12
			}
			a[i]=((int)a[i]==sum)?true:false; //yes then replace with 1 else 0
		}
		System.out.println(Arrays.toString(a));
	}
}
