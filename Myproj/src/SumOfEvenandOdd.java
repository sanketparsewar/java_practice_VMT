
public class SumOfEvenandOdd {

	public static void main(String[] args) {
		int i = 0;
		int even = 0;
		int odd = 0;
		while (i <= 100) {
			if (i % 2 == 0) {
				even = even + i;
			} else {
				odd = odd + i;
			}
			i++;
		}
		System.out.println("Sum of Even:" + even);
		System.out.println("Sum of Odd:" + odd);

	}

}
