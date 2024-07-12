package programss;

import java.util.Scanner;
public class AddWithoutAdd
{
	
	public static int solve(int[] A) {
		int result=1;
        for(int i=0;i<A.length-1;i++)
        {
            if(A[i]>A[i+1])
                {result= 0;
            	break;
                }            
        }
		return result;
    }
	
	public static void main(String []args)
	{AddWithoutAdd s=new AddWithoutAdd();
    int A[]={2,3,5,4};
    System.out.print(solve(A));
		
//		Scanner sc=new Scanner(System.in);
//		System.out.print("Enter 1st number:");
//		int n1=sc.nextInt();
//		System.out.print("Enter 2nd number:");
//		int n2=sc.nextInt();
//		n2=-n2;
//		int sum=n1-n2;
//		System.out.println(sum);
	}
}