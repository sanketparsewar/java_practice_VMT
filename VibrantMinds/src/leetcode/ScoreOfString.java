//Score of a String
//You are given a string s. The score of a string is defined as the sum of the absolute difference between the ASCII values of adjacent characters.

package leetcode;

public class ScoreOfString {
public static void main(String[] args) {
	String s1="zaz";
	char[] c = s1.toCharArray();
	int sum=0;
	for(int i=0;i<=c.length-2;i++) {
		if(c[i]<c[i+1]) {
			sum=sum+(c[i+1]-c[i]);
		}
		else {
			sum=sum+(c[i]-c[i+1]);
		}
	}
	System.out.println(sum);
}
}
