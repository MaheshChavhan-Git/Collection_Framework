package collection.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo1 {

	public static void main(String[] args) {
		Demo1 dm = new Demo1();
		dm.example1();
	}

	public void example1() {
		ArrayList<Integer> numlist = new ArrayList<Integer>();

		numlist.add(10);
		numlist.add(15);
		numlist.add(20);
		numlist.add(25);

		System.out.println(numlist);

		System.out.println("--------");

		// Iterating ArrayList using for_each
		for (Integer nl : numlist) {
			System.out.println(nl);
		}

		System.out.println("--------");

		// Iterating ArrayList using iterator
		Iterator<Integer> itr = numlist.iterator();
		{
			while (itr.hasNext()) {
				System.out.println(itr.next());
			}
		}

	}

}
