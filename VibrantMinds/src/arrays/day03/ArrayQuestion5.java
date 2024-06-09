package arrays.day03;
public class ArrayQuestion5{
	public static void main(String[] args) {
		
	int a[]={ 124, 651, 3896, 467, 234, 977, 543, 23, 23, 467, 235, 112, 5, 21};
	for(int i=0;i<a.length;i++) {
		int sum=0,temp=0;
		while(a[i]!=0)
		{	
			sum*=10;
			temp=a[i]%10;
			sum+=temp;
			a[i]/=10;
		}
		a[i]=sum;
		System.out.print(a[i]);
	}
	}
}