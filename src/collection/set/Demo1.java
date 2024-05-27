package collection.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Demo1 {
	public static void main(String args[]) {
		LinkedHashSet lhs = new LinkedHashSet();
		
		lhs.add("Mahesh");
		lhs.add(26);
		lhs.add("Pranav");
		lhs.add(24);
		lhs.add(null);
		lhs.add("Mahesh");
		lhs.add(null);
		
		Iterator itr = lhs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
