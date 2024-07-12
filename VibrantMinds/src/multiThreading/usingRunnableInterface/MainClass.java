package multiThreading.usingRunnableInterface;

public class MainClass {
	public static void main(String[] args) {
		Writing w = new Writing();
		Reading r = new Reading();
		Listening l = new Listening();
		Thread t1 = new Thread(w); // here we are wrapping in the thread class as we are not having the start
									// method in the runnable interface
		Thread t2 = new Thread(r);
		Thread t3 = new Thread(l);
		t1.start();
		try {
			t1.join(5000);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		t2.start();
		t3.start();
	}
}
