package bridgeLabz;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.io.IOException;

public class ConvertsCharacterOfStringToAscii {
	public static void main(String[] args) throws IOException {
		System.out.print("Enter string: ");
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String str = br.readLine();
		char[] c = str.toCharArray();
		
		int[] c1 = new int[c.length];
		for (int i = 0; i < c.length; i++) {
			c1[i] = (int) c[i];
		}
		System.out.println("Char Array = " + Arrays.toString(c));
		System.out.println("ASCII value Array = " + Arrays.toString(c1));
		System.out.println("Char array to String = "+new String(c));
	}
}
