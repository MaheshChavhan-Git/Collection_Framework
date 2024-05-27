package collection.set;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

public class Demo2 {
	public static void main(String args[]) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("India");
		al.add("USA");
		al.add("UK");
		al.add("Russia");
		al.add("Israil");
		al.add("Australiya");
		
		TreeSet<String> ts = new TreeSet<String>();
		ts.addAll(al);
		/*
		ts.add("MH");
		ts.add("KA");
		ts.add("GA");
		ts.add("MP");
		ts.add("GJ");
		ts.add("MH");
		// ts.add(null);
		ts.add("MH");
		*/
		Iterator<String> itr = ts.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
