package collectionsFramework.lists.arrayLists.generic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class MainClass {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("Sanket");
		list.add("Vaibahv");
		list.add("Aditya");
		list.add("Rushi");
		list.add("Rushi");
		list.add("1");

		list.add("\"a4\"");
		list.add(null);
		list.add(null);
		System.out.println(list);
		System.out.println(list.get(0));
		System.out.println(list.get(5));
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		System.out.println(list.toString());

		// to check element is present in arrayList or not
		System.out.println(list.contains("Aditya"));

		// print elements of arrayList proper order
		Iterator<String> itr = list.listIterator();
		while (itr.hasNext())
			System.out.println(itr.next());

		//print elements of arrayList in reverse order
		ListIterator<String> it = list.listIterator(list.size());
		while (it.hasPrevious())
			System.out.println(it.previous());

		// Lambda function to print the elements of the arrayList
		list.forEach(e -> System.out.println(e));
		list.forEach(e->System.out.println(e));

	}
}