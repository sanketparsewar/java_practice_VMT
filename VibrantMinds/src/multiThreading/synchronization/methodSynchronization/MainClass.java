package multiThreading.synchronization.methodSynchronization;

public class MainClass {
public static void main(String[] args) { 
	Site s1 = new Site();
	User u1=new User(s1);
	User u2=new User(s1);
	User u3 = new User(s1);
	Thread t1= new Thread(u1);
	Thread t2= new Thread(u2);
	Thread t3= new Thread(u3);
	t1.setName("Abc");
	t2.setName("Pqr");
	t3.setName("Xyz");
	t2.setPriority(10);
	t1.start();
	t2.start();
	t3.start();
}
}
