package leetcode;

import java.util.Arrays;

public class MininumAverage {
	public double minimumAvg(int[] nums) {
		Arrays.sort(nums);
		double[] list = new double[nums.length/2];
		System.out.println(Arrays.toString(nums));
		int len=nums.length;
		for(int i=0;i<=nums.length/2-1;i++) {
			len-=1;
			double avg=(nums[i]+nums[len])/(double)2;  //
			list[i]=avg;
		}
		Arrays.sort(list);
//		System.out.println(Arrays.toString(list));
		return list[0];
	}

	public static void main(String[] args) {
		int[] nums = {1,9,8,3,10,5};
		MininumAverage m=new MininumAverage();
		System.out.println(m.minimumAvg(nums));
		
	}
}
