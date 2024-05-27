package collection.failfast.failsafe;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class Demo1 {

	public static void main(String[] args) {
		
		CopyOnWriteArrayList<Integer> al = new CopyOnWriteArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		
		Iterator<Integer> itr = al.iterator();
		while(itr.hasNext()) {
			Integer value = itr.next();
			if(value.equals(10)) {
				al.remove(value);
			}
		}
		System.out.println(al);
	}

}
