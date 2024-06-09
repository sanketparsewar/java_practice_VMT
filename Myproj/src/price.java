import java.util.Scanner;

public class price {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Item number");
		int Inum = s.nextInt();
		System.out.println("Item name");
		String Iname = s.next();
		System.out.println("Item rate");
		double Irate = s.nextDouble();
		System.out.println("Item quantity");
		int Iquant = s.nextInt();
		double price = Irate * Iquant;
		double discount = 0;
		if (price >= 1000 && price < 2000) {
			discount = price * 0.10;

		} else if (price >= 2000 && price < 3000) {
			discount = price * 0.15;

		} else if (price >= 3000 && price < 5000) {
			discount = price * 0.20;

		} else if (price >= 5000) {
			discount = price * 0.25;

		}
		double netPrice;
		netPrice = price - discount;
		System.out.println("Item number: " + Inum);
		System.out.println("Item name: " + Iname);
		System.out.println("Item Price: " + price);
		System.out.println("Item discount: " + discount);
		System.out.println("Net price: " + netPrice);

	}

}
