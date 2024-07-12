package multiThreading.usingRunnableInterface;

public class Listening implements Runnable{
public void musicListening() {
	for(int i =0;i<10;i++) {
		System.out.println("Music listening process");
	}
}
public void run() {
	musicListening();
}
}
