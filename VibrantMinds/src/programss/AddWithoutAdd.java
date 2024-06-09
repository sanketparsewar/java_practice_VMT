package programss;

import java.util.Scanner;
public class AddWithoutAdd
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter 1st number:");
		int n1=sc.nextInt();
		System.out.print("Enter 2nd number:");
		int n2=sc.nextInt();
		n2=-n2;
		int sum=n1-n2;
		System.out.println(sum);
	}
}