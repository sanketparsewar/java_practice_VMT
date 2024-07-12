//Valid Parentheses
//Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
//An input string is valid if:
//Open brackets must be closed by the same type of brackets.
//Open brackets must be closed in the correct order.
//Every close bracket has a corresponding open bracket of the same type.

package leetcode;

import java.util.Arrays;

public class ValidParantheses {
	public char[] isValid(String s) {
		boolean bracket=false;
		int round=0,square=0,curly=0;
		char c[]=s.toCharArray();
		int index=0;
		char n[]=new char[c.length];
		for(int i=0;i<=c.length-1;i++) {
			if(c[i]=='(')
				n[index]=c[i];
			else if(c[i]=='[')
				square++;
			else if(c[i]=='{')
				curly++;
			
		}
		
		return n;
	}

	public static void main(String[] args) {
		ValidParantheses s =new ValidParantheses();
		char c1[]=s.isValid("(()()})");
		System.out.println(Arrays.toString(c1));
	}
}
