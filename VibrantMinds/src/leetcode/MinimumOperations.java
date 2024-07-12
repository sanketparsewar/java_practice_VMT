package leetcode;

public class MinimumOperations {
	public int minimumOperations(int[] nums) {
		int count = 0;
		for (int i : nums)
			if (i % 3 == 1 || i % 3 == 2)
				count++;

		return count;
	}

	public static void main(String[] args) {
		int[] nums = { 3,6,9 };
		MinimumOperations m = new MinimumOperations();
		System.out.println(m.minimumOperations(nums));
	}
}
