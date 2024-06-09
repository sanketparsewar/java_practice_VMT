
import java.util.Scanner;

public class PrintArrayElement {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("ENter array size");
		int size = s.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter values ");
		for (int i=0;i<size;i++) {
			arr[i]=s.nextInt();
		}
		System.out.println("Given array Elements");
		for(int i=0;i<size;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println("\nGiven array elements useing foreach");
		for (int x:arr) {
			System.out.println(x);
		}
	}

}
