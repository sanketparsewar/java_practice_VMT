package multiThreading.usingRunnableInterface;

public class Writing implements Runnable{
	public void bookWriting() {
		for(int i=0;i<10;i++)
		{ Thread t =Thread.currentThread();
			System.out.println(t.getName() + " = Name Book writing process Id= "+t.threadId());
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				System.out.println(e);
			}
		}
	}
	public void run() {
		bookWriting();
	}

}
