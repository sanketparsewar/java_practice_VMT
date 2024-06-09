package programss;

import java.util.Arrays;

public class Prog1 {
public static void main(String[] args) {
	int a[]= {1,2,6,3,4,8,9,5,10,7};
	for(int i=0;i<=a.length/2;i++)
	{
		for(int j=i;j<=a.length/2;j++)
		{
			if(a[i]>a[j])
			{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}

	for(int i=(a.length/2);i<=a.length-1;i++)
	{
		for(int j=i;j<=a.length-1;j++)
		{
			if(a[i]<a[j])
			{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}
	System.out.println(Arrays.toString(a));
}
}
