package bridgeLabz;

import java.util.Scanner;

public class CheckTheSeason {
	public static void main(String[] args) {
		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter month number: ");
			String month = sc.nextLine();
			try {
				int m = Integer.parseInt(month);
				switch (m) {
				case 1:
					System.out.println("Shishira / Winter");
					return;
				case 2:
					System.out.println("Vasanta");
					return;
				case 3:
					System.out.println("Vasanta");
					return;
				case 4:
					System.out.println("Grishma / Summer");
					return;
				case 5:
					System.out.println("Grishma / Summer");
					return;
				case 6:
					System.out.println("Monsoon / Rainy");
					return;
				case 7:
					System.out.println("Monsoon / Rainy");
					return;
				case 8:
					System.out.println("Sharada");
					return;
				case 9:
					System.out.println("Sharada");
					return;
				case 10:
					System.out.println("Hemanta");
					return;
				case 11:
					System.out.println("Hemanta");
					return;
				case 12:
					System.out.println("Shishira / Winter");
					return;

				default:
					System.out.println("Enter number between 1 to 12");
					System.out.println();
					break;
				}
			} catch (NumberFormatException e) {
				System.out.println(e);
				System.out.println();
			}
		}

	}
}
