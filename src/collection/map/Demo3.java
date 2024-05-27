package collection.map;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;

public class Demo3 {
	public static void main(String args[]) {

		Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
		ht.put(101, "Mahesh");
		ht.put(102, "Pranav");
		ht.put(103, "Prachi");
		ht.put(104, "Ankita");
		ht.put(101, "Balaji");

		Iterator<Entry<Integer, String>> itr = ht.entrySet().iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}
}
