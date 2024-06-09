package pattern;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Pattern1 {
	public static void main(String[] args)throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.print("Enter value:");
		int n = Integer.parseInt(br.readLine());
		for (int l = 0; l < n; l++) {
			for (int i = 0; i < n; i++) {
				for (int k = 0; k < n; k++) {
					for (int j = 0; j < n; j++) {
						System.out.print("*");
					}
					System.out.print(" ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}
