package multiThreading.usingRunnableInterface.site.getNamegetThreadIdgetPriority;

public class MainClass {
public static void main(String[] args) {
	Site s1 = new Site();
	User u1 =new User(s1);
	User u2 = new User(s1);
	User u3 = new User (s1);
	User u4 = new User(s1);
	Thread t1 = new Thread (u1);
	Thread t2 = new Thread(u2);
	Thread t3 = new Thread (u3);
	Thread t4 = new Thread(u4);
	t1.setName("first");
	t2.setName("second");
	t3.setName("Third");
	t4.setName("Fourth");
	t1.setPriority(10);
	t2.setPriority(1);    // Use to set priority between
	t3.setPriority(5);    // Use to set priority between
	t4.setPriority(1);    // Use to set priority between
	t1.start();
	t2.start();
	t3.start();
	t4.start();
}
}
