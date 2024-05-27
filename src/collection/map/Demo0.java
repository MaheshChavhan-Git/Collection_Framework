package collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class Demo0 {

	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(101, "Mahesh");
		hm.put(102, "Pranav");
		hm.put(103, "Prachi");
		hm.put(104, "Ankita");
		hm.put(101, "Balaji");
		hm.put(null, null);
		hm.put(null, null);

		Iterator<Entry<Integer, String>> itr = hm.entrySet().iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
