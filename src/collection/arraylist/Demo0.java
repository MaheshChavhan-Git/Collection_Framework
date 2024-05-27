package collection.arraylist;

import java.util.ArrayList;

public class Demo0 {
	public static void main(String args[]) {
		ArrayList al = new ArrayList();

		al.add("Mahesh");
		al.add(25);
		al.add(25.5);
		al.add(null);
		al.add(null);

		System.out.println(al);
		System.out.println(al.contains("Mahesh"));
		System.out.println(al.size());
		System.out.println(al.lastIndexOf(25));
	}
}
