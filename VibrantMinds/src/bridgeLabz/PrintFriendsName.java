package bridgeLabz;

import java.io.IOException;

public class PrintFriendsName {
	public void PrintFriendsNameReverse(String str) {
		String[] a = str.split(",");
		System.out.print("\"Hi ");
		for (int i = a.length - 1; i >= 0; i--) {
			if (i == 0)
				System.out.print(" and " + a[i] + "\"");
			else if (i != 0 && i != a.length - 1) {
				System.out.print(", " + a[i]);
			} else
				System.out.print(a[i]);
		}
	}

	public static void main(String[] args) throws IOException {
		PrintFriendsName p = new PrintFriendsName();
		String str = "Sanket,vaibhav,parsewar";
		p.PrintFriendsNameReverse(str);
	}
}


