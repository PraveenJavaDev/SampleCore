package com.core.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DemoArrayList {
	public static void main(String[] args) {

		ArrayList<Integer> list3 = new ArrayList<>();
		list3.add(23);
		list3.add(24);
		list3.add(25);

		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(4);
		list.add(3);
		list.add(5);
		// list.remove(4);
		// list.remove(6);
		// list.removeIf(y->y==4);
		// list.add(2, 7);
		// list3.addAll(list);
		list3.addAll(1, list);
		// list3.clear();
		// list3.removeAll(list);
		System.out.println(list.contains(2));
		System.out.println(list3.containsAll(list));
		System.out.println(list3.indexOf(24));

		/*
		 * for (int i = 0; i < list3.size(); i++) { System.out.println(list3.get(i));
		 * 
		 * }
		 */
		
		  for (Integer r : list3) {
		  
		  System.out.println(r); }
		/*
		 * Iterator<Integer> itr = list3.iterator(); while (itr.hasNext()) {
		 * System.out.println(itr.next());
		 * 
		 * }
		 */

	}

}
