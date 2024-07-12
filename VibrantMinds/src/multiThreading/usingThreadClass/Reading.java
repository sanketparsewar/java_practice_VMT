package multiThreading.usingThreadClass;

public class Reading extends Thread{
public void bookReading () {
	for(int i=0;i<=10;i++) {
		System.out.println("Book Reading process");
	}
}
public void run() {
	bookReading();
}
}
