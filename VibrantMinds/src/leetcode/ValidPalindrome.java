package leetcode;

public class ValidPalindrome {
	public static void main(String[] args) {
		String str = "race a ecar";
		boolean result = true;
		char c[] = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase().toCharArray();
		int last = c.length - 1;
		for (int i = 0; i < c.length / 2; i++) {
			if (c[i] == c[last])
				last--;
			else {
				result = false;
				break;
			}
		}
		System.out.println(result);
	}
}
