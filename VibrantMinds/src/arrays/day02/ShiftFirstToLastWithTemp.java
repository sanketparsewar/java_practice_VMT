package arrays.day02;

//input={10,20,30,40,50}
//output={20,30,40,50,10}

class ShiftFirstToLastWithTemp
{
	public static void main(String args[])
	{
		int a[]={10,20,30,40,50};
		for (int i=1;i<a.length;i++)
		{	int temp=a[i-1];
			a[i-1]=a[i];
			a[i]=temp; 
		}		
		for (int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);	

		}
	
	}
}