package multiThreading.usingThreadClass;

public class Writing extends Thread{
	public void bookWriting() {
		for(int i=0;i<=10;i++)
		{
			System.out.println("Book writing progress");
		}
	}
	public void run() {
		bookWriting();
	}
}
