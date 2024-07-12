package collectionsFramework.lists.stack;

import java.util.Stack;

public class MainClass {
	public static void main(String[] args) {
		Stack<Object> s=new Stack<>();
		s.add(31);
		s.add(32);
		s.add(33);
		s.add(34);
		s.add(35);
		s.add(36);
		s.add(37);
		System.out.println(s);
		s.pop();
		System.out.println(s);
		System.out.println("Top is at "+s.peek());
		System.out.println(s.empty());
		s.push(39);
		System.out.println(s);
		System.out.println("Top is at "+s.peek());
	}
}
