package collectionsFramework.mapday1;

import java.util.ArrayList;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Map2 {
	public static void main(String[] args) {
		Map<String, List<String>> m = new HashMap<>();
		String q1 = "What is Java?";
		List<String> aq1=new ArrayList<>();
		aq1.add("Programing language");
		aq1.add("Name of person");
		aq1.add("Object");
		aq1.add("Java is pen");
		m.put(q1, aq1);
		System.out.println(m);
		Set<String> set=m.keySet();
		for(String key:set) {
			List<String> l = m.get(key);
			System.out.println(key);
			for(String s:l) {				
				System.out.println(s);
			}
			
		}
	}
}
