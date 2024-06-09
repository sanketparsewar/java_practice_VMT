package arrays.day03;

import java.util.Arrays;

public class AppendSerialnoAtFirst {
	public static void main(String[] args) {
		int a[]= {10,23,121,2323,123,13,4,4,21,1};
		int count=1;
		for(int i=a.length-1;i>=0;i--)
		{
			int temp=a[i],length=0,c=count;
			while(temp!=0)
			{
				temp/=10;
				length++;
			}
			c*=Math.pow(10, length);
			a[i]=a[i]+c;			
			count++;
		}
		System.out.println(Arrays.toString(a));
	}
}
