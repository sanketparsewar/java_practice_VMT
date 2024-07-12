package collectionsFramework.mapday1;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Map1 {
	public static void main(String[] args) {
		Map<String, String> m = new HashMap<>();
		m.put("a", "Sanket");
		m.put("b", "Vaibhav");
		m.put("c", "Hitesh");
		m.put("c", "ADi");
		m.put("c", "Aditya");
		System.out.println(m);
		System.out.println(m.get("c"));
		System.out.println(m.containsKey("d"));
		System.out.println(m.keySet());
		Set<String> s = m.keySet();
		for (String key : s) {
			System.out.println(key + "\t" + m.get(key));
		}
		System.out.println("------------------------------");
		Iterator<Entry<String,String>> itr =  m.entrySet().iterator();
		while(itr.hasNext()) {
			Entry<String,String> e = itr.next();
			System.out.println(e.getKey()+"\t" +e.getValue());
		}
	}
}
