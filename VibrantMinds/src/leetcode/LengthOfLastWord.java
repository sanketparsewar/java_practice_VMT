package leetcode;

import java.util.Arrays;

public class LengthOfLastWord {

	public static void main(String[] args) {
		String str="luffy is still joyboy";		
		str=str.trim().strip();
		String str1[]=str.split(" ");	
		int length= str1[str1.length-1].toCharArray().length;
		System.out.println(length);
		
	}

}
