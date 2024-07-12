//Find the Index of the First Occurrence in a String
//Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.


package leetcode;

public class IndexOfFirstOccuranceInString {
	public int strStr(String haystack, String needle) {
		int index=0;
		index=haystack.indexOf(needle);
		if(index<=haystack.length() && index>=0)
				return index;
		else
			return -1;
	}
	
	public static void main(String[] args) {
		IndexOfFirstOccuranceInString i=new IndexOfFirstOccuranceInString();
		System.out.println(i.strStr("leetcode", "leeto"));
	}
}
