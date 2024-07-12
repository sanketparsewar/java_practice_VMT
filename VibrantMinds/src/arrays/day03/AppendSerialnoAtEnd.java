package arrays.day03;

import java.util.Arrays;

public class AppendSerialnoAtEnd {
	public static void main(String[] args) {
		int a[]= {11,12,4,21,54,33,6655,4543,65,27,8,98};
		int count=1;
		for(int i=a.length-1;i>=0;i--) {
			int len=0,temp=count;
			while(temp!=0)
				{temp/=10;
				 len++;
				}
			a[i]*=Math.pow(10, len);
			a[i]+=count;
			count++;
		}
		System.out.println(Arrays.toString(a));
	}
}
