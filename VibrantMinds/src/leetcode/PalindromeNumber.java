//9. Palindrome Number
//Given an integer x, return true if x is a palindrome, and false otherwise
package leetcode;

public class PalindromeNumber {
	public boolean isPalindrome(int x)
	{	boolean r=false;
		String p=Integer.toString(x);
		for(int i=0;i<=p.length()-1;i++)
		{
			if(!(p.charAt(i)==p.charAt(p.length()-1-i)))
			{	
				r=false;
				break;
			}
			else
				r=true ;
		}
		return r;
	}
	
	public static void main(String[] args) {
		PalindromeNumber pn=new PalindromeNumber();
		System.out.println(pn.isPalindrome(-20));
	}
}
