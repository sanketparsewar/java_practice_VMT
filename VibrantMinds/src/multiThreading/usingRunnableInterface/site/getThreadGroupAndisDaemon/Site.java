package multiThreading.usingRunnableInterface.site.getThreadGroupAndisDaemon;

public class Site {
	public void doReservation() {
		Thread t = Thread.currentThread();
		ThreadGroup tg = t.getThreadGroup();
		for (int i = 0; i < 10; i++) { // tg.getName() gives the source of the thread
			System.out.println(t.threadId()+"\t"+t.isDaemon() + "\t" + t.getName() + "\t" + tg.getName() + "\t" + "Reserving process");
		}
	}
}
