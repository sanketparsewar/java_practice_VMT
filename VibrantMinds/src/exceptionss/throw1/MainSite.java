package exceptionss.throw1;

public class MainSite {
public static void main(String[] args) {
	System.out.println("Program started");
	Site s = new Site();
	try {
		s.login(1);
	}
	catch(ArithmeticException e){
		e.printStackTrace();
	}
	System.out.println("Program end");
}
}
