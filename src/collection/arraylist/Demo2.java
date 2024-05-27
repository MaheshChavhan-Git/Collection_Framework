package collection.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Demo2 {
	public static void main(String args[]) {
		Demo2 dm2 = new Demo2();
		dm2.example2();
	}

	public void example2() {
		ArrayList<String> al1 = new ArrayList<String>();
		al1.add("Nanded");
		al1.add("Nagpur");
		al1.add("Pune");
		al1.add("Mumbai");

		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("Jaipur");
		al2.add("Udaipur");
		al2.add("Pokhran");
		al2.add("Kumbhalgarh");

		al1.addAll(al2);
		Collections.sort(al1);

		Iterator<String> itr = al1.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
