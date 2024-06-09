import java.util.Scanner;

public class SumOfArrayElements {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] arr = new int[5];
		int sum=0;
		System.out.println("Enter 5 values for array ");
		for(int i=0;i<arr.length;i++) {
			arr[i]=s.nextInt();
			sum=sum+arr[i];			
		}
		
		System.out.println("Sum= "+sum);

	}

}
