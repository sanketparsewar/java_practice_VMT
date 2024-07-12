package bridgeLabz;

import java.util.Scanner;

public class TemperatureConversion {
	public static void main(String[] args) {
		System.out.println("Select choice");
		System.out.println("1.Celsius to Fahrenheit");
		System.out.println("2.Fahrenheit to Celsius");
		System.out.print("Enter your Choice: ");
		Scanner sc = new Scanner(System.in);
		int ch = sc.nextInt();
		switch (ch) {
		case 1:
			System.out.println("Enter Celsius Value: ");
			float c = sc.nextFloat();
			System.out.println("Value in degree Fahrenheit is = " + ((c * 9 / 5) + 32));
			break;
		case 2:
			System.out.println("Enter Fahrenheit Value: ");
			float f = sc.nextFloat();
			System.out.println("Value in degree Celcius is = " + ((f - 32) * 5 / 9));
			break;
		default:
			System.out.println("Invalid input.");
			break;
		}
	}
}
