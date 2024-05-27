package collection.map;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class Demo1 {
	public static void main(String args[]) {

		LinkedHashMap<Integer, String> lhm = new LinkedHashMap<Integer, String>();

		lhm.put(101, "Mahesh");
		lhm.put(102, "Pranav");
		lhm.put(103, "Prachi");
		lhm.put(104, "Ankita");
		lhm.put(101, "Balaji");
		lhm.put(null, null);
		lhm.put(null, null);

		Iterator<Entry<Integer, String>> itr = lhm.entrySet().iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}
}
