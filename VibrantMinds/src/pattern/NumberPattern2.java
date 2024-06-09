package pattern;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class NumberPattern2 {
public static void main(String[] args)throws IOException {
	InputStreamReader isr= new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(isr);
	System.out.println("Enter value:");
	int n = Integer.parseInt(br.readLine());
	for(int i = n;i>=1;i--)
	{
		for(int j=i;j<=n;j++)
			System.out.print(i);
		System.out.println();
	}
}
}
