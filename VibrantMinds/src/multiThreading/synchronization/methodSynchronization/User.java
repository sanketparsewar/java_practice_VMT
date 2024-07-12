package multiThreading.synchronization.methodSynchronization;

public class User implements Runnable {
private Site s= null;
User(){}
User(Site s){
	this.s=s;
}
public void run()
{
	s.doReservation();
}
}
