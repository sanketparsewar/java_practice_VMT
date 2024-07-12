package multiThreading.usingRunnableInterface.site.getThreadGroupAndisDaemon;

public class MainClass {
public static void main(String[] args) {
	Site s1= new Site();
	User u1 = new User(s1);
	User u2 = new User(s1);
	User u3=new User(s1);
	Thread t1= new Thread(u1);
	Thread t2= new Thread(u2);
	Thread t3= new Thread(u3);
	t1.setName("abc");
	t2.setName("def");
	t3.setName("xyz");
	t1.setDaemon(true);
	t1.setPriority(10);
	t2.setPriority(5);
	t1.start();
	t2.start();
	t3.start();
}
}

