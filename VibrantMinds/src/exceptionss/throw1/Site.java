package exceptionss.throw1;

public class Site {
public void login(int age)
{
	System.out.println("WElcome this site");
	if(age>=70)
	{
		home();
	}
	else
		throw new ArithmeticException();
}
private void home(){
	System.out.println("Welocome to your second home");
}
}








