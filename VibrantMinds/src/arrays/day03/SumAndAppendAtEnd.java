package arrays.day03;

import java.util.Arrays;

public class SumAndAppendAtEnd {

	public static void main(String[] args) {
		int a[]= {123,43,234,354,645,7678,76};
		for (int i = 0; i < a.length; i++) {
			int temp=a[i];
			int sum=0;
			while(temp!=0) {
				sum=sum+temp%10;
				temp=temp/10;
			}
			int length=0;
			temp=sum;
			while(temp!=0) {
				temp=temp/10;
				length++;
			}
			a[i]*= Math.pow(10, length);
			a[i]+=sum;
			
			
		}
		System.out.println(Arrays.toString(a));
		
	}

}
