import java.util.Scanner;

public class SearchInArray {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter element to search ");
		int n= s.nextInt();
		int[] arr= {10,20,30,2,12,32,43};
		for (int i=0;i<arr.length;i++) {
			if (n==arr[i]){
				System.out.println("Element "+n+" present at index "+i);
				break;
			}
			else if(i==arr.length-1) {
				System.out.println("Element not present");
				break;
			}

			
		}

	}

}
