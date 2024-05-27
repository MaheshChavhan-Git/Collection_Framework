package collection.vector;

import java.util.Iterator;
import java.util.Vector;

public class Demo0 {
	public static void main(String args[]) {
		Vector<String> vector = new Vector<String>();
		
		vector.add("Pune");
		vector.add("Mumbai");
		vector.add("Nagpur");
		
		while(vector.contains("Mumbai")) {
			vector.remove("Mumbai");
		}
		
		Iterator<String> itr = vector.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
