//Non generic collection allows heterogeneous elements
package collectionsFramework.lists.arrayLists.nonGeneric;

import java.util.ArrayList;

public class MainClass{
	public static void main(String[] args) {
		ArrayList<Object> list = new ArrayList<>();
		list.add(9);
		list.add(true);
		list.add(9.5);
		list.add("sanket");
		System.out.println(list);
	}
}
