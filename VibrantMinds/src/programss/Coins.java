package programss;

public class Coins {

	public void countCoins(int coin1, int coin2, int totalValue) {
		if (totalValue < 0 || totalValue < coin2 || totalValue < coin1 || coin1 < 0 || coin2 < 0) {
			System.out.println("Entered valid data.");
			System.exit(0);
		}
		if (coin1 < coin2) {
			int temp = coin1;
			coin1 = coin2;
			coin2 = temp;

		}

		if (totalValue % coin1 == 0) {
			System.out.println("NO. of " + coin1 + " rs coins are " + totalValue / coin1);
			System.out.println("NO. of " + coin2 + " rs coins are " + 0);
			System.out.println("Total value is "+totalValue);

		}

		else if ((totalValue % coin1) % coin2 == 0) {
			System.out.println("NO. of " + coin1 + " rs coins are " + totalValue / coin1);
			System.out.println("NO. of " + coin2 + " rs coins are " + (totalValue % coin1) / coin2);
			System.out.println("Total value is "+totalValue);
		}

		else {
			int no_of_coin1 = (totalValue / coin1) - 1;
			int value = no_of_coin1 * coin1;
			while (true) {
				if ((totalValue - value) < 0) {
					System.out.println("Give value that will be splitted!");
					System.exit(0);
				}
				if ((totalValue - value) % coin2 == 0) {
					System.out.println("NO. of " + coin1 + " rs coins are " + no_of_coin1);
					System.out.println("NO. of " + coin2 + " rs coins are " + (totalValue - value) / coin2);
					System.out.println("Total value is "+totalValue);
					break;
				}
				no_of_coin1 -= 1;
				value = no_of_coin1 * coin1;
			}
		}
	}


	public static void main(String[] args) {
		Coins s = new Coins();
		s.countCoins(10, 2, 12);
	}
}
