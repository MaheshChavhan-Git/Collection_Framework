package collection.set;

import java.util.HashSet;
import java.util.Iterator;

public class Demo0 {
	public static void main(String args[]) {
		HashSet hs = new HashSet();

		hs.add("Mahesh");
		hs.add(null);
		hs.add(null);
		hs.add("Mahesh");
		hs.add(20);
		hs.add("Pranav");
		hs.add(123.4);
		hs.add("Ankita");
		hs.add("Prachi");
		hs.add(10);

		Iterator itr = hs.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}
}
