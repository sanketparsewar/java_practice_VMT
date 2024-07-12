//method synchronization
package multiThreading.synchronization.methodSynchronization;

public class Site {
	private boolean booked = false;

	synchronized public void doReservation() {
		Thread t = Thread.currentThread();
		if (!booked) {
			for (int i = 0; i < 10; i++)
				System.out.println(t.getName() + "\t" + " Reservation processing");
			booked = true;
			System.out.println(t.getName() + "\tTicket booked");

		} else {
			System.out.println(t.getName() + "\tSorry ticket booked");
		}
	}
}
