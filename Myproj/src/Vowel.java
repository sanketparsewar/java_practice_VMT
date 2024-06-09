import java.util.Scanner;

public class Vowel {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any alphabet ");
		String c = s.next();
		switch (c) {
		case "a":System.out.println(c+" is Vowel"); break;
		case "e":System.out.println(c+" is Vowel"); break;
		case "i":System.out.println(c+" is Vowel"); break;
		case "o":System.out.println(c+" is Vowel"); break;
		case "u":System.out.println(c+" is Vowel"); break;
		case "A":System.out.println(c+" is Vowel"); break;
		case "E":System.out.println(c+" is Vowel"); break;
		case "I":System.out.println(c+" is Vowel"); break;
		case "O":System.out.println(c+" is Vowel"); break;
		case "U":System.out.println(c+" is Vowel"); break;
		default :System.out.println("consonant");
		}
		

	}

}
