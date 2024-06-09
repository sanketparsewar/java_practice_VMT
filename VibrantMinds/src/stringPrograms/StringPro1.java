package stringPrograms;

public class StringPro1 {

	public static void main(String[] args) {
		String str= "Computer";
		String vouls="aeiouAEIOU";
		int count=0;
		for(int i=1;i<str.length();i++)
		{
			if(vouls.indexOf(str.charAt(i))>=0){ 
				count++;
			}
		}
		System.out.println(count);
	}
}
