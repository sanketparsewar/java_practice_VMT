import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Arrays;

public class GetArrayPerformOperation {
	public static void main(String[] args)throws IOException {

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br =new BufferedReader(isr);
		System.out.println("Enter the size of array=");
		int a[]=new int[Integer.parseInt(br.readLine())];
		for (int i = 0; i < a.length; i++) {
			System.out.print("Enter value for a["+i+"]: ");
			a[i]=Integer.parseInt(br.readLine());
		}
		System.out.println(Arrays.toString(a));

		ArrayOperations ao= new ArrayOperations();
		while(true) {	
		System.out.println("1.Reverse Array");
		System.out.println("2.Swap First And Last");
		System.out.println("3.Shift First To Last");
		System.out.println("4.Shift Last To First");
		System.out.println("5.First Maximum");
		System.out.println("6.Second Maximum");
		System.out.println("7.Exit");
		System.out.print("Enter choice:");
		int ch=Integer.parseInt(br.readLine());
		switch(ch) {
		case 1: 
			System.out.println(Arrays.toString(ao.Reverse(a)));
			System.out.println();
			break;
		case 2:
			System.out.println(Arrays.toString(ao.swapFirstAndLast(a)));
			System.out.println();
			break;
		case 3:
			System.out.println(Arrays.toString(ao.shiftFirstToLast(a)));
			System.out.println();
			break;
			
		case 4:
			System.out.println(Arrays.toString(ao.shiftLastToFirst(a)));
			System.out.println();
			break;
		case 5:
			System.out.println("First Max= "+ao.firstMax(a));
			System.out.println();
			break;
		case 6:
			System.out.println("Second Max= "+ao.secondMax(a));
			System.out.println();
			break;
		default: 
			System.out.println("Program terminated!");
			System.exit(ch);
			}
		}
	}
}
