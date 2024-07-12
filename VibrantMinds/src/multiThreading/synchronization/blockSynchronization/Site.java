package multiThreading.synchronization.blockSynchronization;

public class Site {
	private boolean booked = false;

	public void doReservation() {
		Thread t = Thread.currentThread();
		for(int i=1;i<=10;i++) {
			System.out.println(t.getName()+"\t"+t.getPriority()+" Reservation process");
		}
		synchronized(this) {
			if(!booked) {
				for(int i=1;i<=10;i++)
				{
					System.out.println(t.getName()+"\t"+t.getPriority()+" payment in process");
				}
				booked=true;
				System.out.println(t.getName()+" Your ticket booked.");
			}
			else {
				System.out.println(t.getName()+" Sorry ticket not available");
			}
		}
	}
}
