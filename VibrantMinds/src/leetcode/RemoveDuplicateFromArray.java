package leetcode;

import java.util.Arrays;

public class RemoveDuplicateFromArray {
	public int removeDuplicates(int[] nums) {
		int[] n1 = new int[nums.length];
		int index = 0;
		for (int i = 0; i <= nums.length - 2; i++) {
			if (nums[i] != nums[i + 1]) {
				n1[index++] = nums[i];
			}
		}

		n1[index++] = nums[nums.length - 1];

		for (int i = 0; i <= index - 1; i++) {
			nums[i] = n1[i];
		}

		 System.out.println(Arrays.toString(nums));
		return index;
	}

	public static void main(String[] args) {
		RemoveDuplicateFromArray r = new RemoveDuplicateFromArray();
		int[] nums = { 1,1,2,2,3,4,5,6,6,7,7,8,8,8,8,8};
		int index = r.removeDuplicates(nums);
		for(int i = 0; i<index; i++) {
			System.out.print(nums[i]+" ");
		}
		


		

	}
}
