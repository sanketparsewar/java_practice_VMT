package collectionsFramework.lists.linkedList;
import java.util.LinkedList;

public class MainClass {
public static void main(String[] args) {
	LinkedList<Object> list = new LinkedList<>();
	list.add(3);
	list.add("sanket");
	list.add(true);
	list.add(null);
	list.add(56.5);
	System.out.println(list);
	System.out.println((list.contains(33)));
}
}
