package stringPrograms;

public class StringProgram {

	public static void main(String[] args) {
		String str = "Computer";
//		String str1 = "computer";
//		String str2 = "comp";
		String vowels = "aeiouAEIOU";
		int count = 0;
		for (int i = 1; i < str.length(); i++) {
			if (vowels.indexOf(str.charAt(i)) >= 0) {
				count++;
			}
		}
		System.out.println(count);
		System.out.println(str.charAt(5)); // print character at given index
		System.out.println(str.compareTo(vowels)); // calculate difference between ascii value of 1st charatcter of two
													// string
//		
//		System.out.println(str.concat(vowels));
//		System.out.println(str.contains("aei"));
//		System.out.println(str.endsWith("IOU"));
//		System.out.println(str.equals(vowels));
//		System.out.println(str.equalsIgnoreCase(str1));
//		String str3 = "       Sanket S   Parsewar   ";
//		System.out.println(str3.trim());
//		System.out.println(str3.replace('S', 's'));

//		String s1 = "abcd";
//		byte[] barr = s1.getBytes();
//		for (int i = 0; i < barr.length; i++) {
//			System.out.println(barr[i]);
//		}
//		System.out.println(str3.indexOf("a"));
	}
	
}
