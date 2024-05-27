package collection.map;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Demo2 {

	public static void main(String[] args) {
		TreeMap<Integer, String> tm = new TreeMap<Integer, String>();

		tm.put(101, "Mahesh");
		tm.put(102, "Pranav");
		tm.put(103, "Prachi");
		tm.put(104, "Ankita");
		tm.put(101, "Balaji");
		tm.put(105, null);

		Iterator<Entry<Integer, String>> itr = tm.entrySet().iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
