package multiThreading.usingRunnableInterface.site.getNamegetThreadIdgetPriority;

public class Site {
public void doReservation() {
	Thread t =Thread.currentThread();
	for(int i=0;i<10;i++) {
		System.out.println(t.threadId()+"\t"+t.getName()+"\t"+t.getPriority()+" Reservation processing");
	}
}
}
