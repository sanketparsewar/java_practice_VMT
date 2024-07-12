package pattern;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Starpattern1 {
public static void main(String[] args)throws IOException {
	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(isr);
	System.out.println("Enter value:");
	int n = Integer.parseInt(br.readLine());
	for (int i = 1; i <= n; i++) {
		for(int j=i;j>=1;j-- ) {
			System.out.print("*");
			
		}
		System.out.println();
	}
}
}
