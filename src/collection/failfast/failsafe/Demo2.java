package collection.failfast.failsafe;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo2 {
	public static void main(String args[]) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);

		Iterator<Integer> itr = al.iterator();
		while (itr.hasNext()) {
			Integer value = itr.next();
			if(value.equals(10)) {
				itr.remove();
			}
		}
		System.out.println(al);
	}
}
