package com.coding.corejava;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class BookRating {
	public static void main(String[] args) {
		String arr[] = { "7 Praveen kumar 366pages 46pages adventure", 
				"8 srinivas k 196pages 120pages novel" };
		List<List<String>> inlist = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {

			String s = arr[i];
			System.out.println(s);
			String num = "";
			int dummy = 0;
			//int sum1 = 0;
			List<String> list = new ArrayList<>();
			for (int j = 0; j < s.length(); j++) {
				if (Character.isDigit(s.charAt(j))) {
					dummy = 0;
					num = num + s.charAt(j);
					// System.out.println(num);
				} else {
					dummy++;
				}

				if (dummy == 1) {
					//System.out.println(num);
					list.add(num);
					// sum1 = sum1 + Integer.parseInt(num);
					num = "";

				}
			}
			inlist.add(new ArrayList(list));

			list.clear();

		}
		TreeMap<Integer, Integer> getres = new TreeMap<>();
		for (int i = 0; i < inlist.size(); i++) {
			int key = Integer.parseInt(inlist.get(i).get(0));
			int tpages = Integer.parseInt(inlist.get(i).get(1));
			int rpage = Integer.parseInt(inlist.get(i).get(2));

			int value = (rpage * 100 / tpages);
			getres.put(key, value);

		}
		//System.out.println(getres);
		int number = getres.lastKey();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].charAt(0) - 48 == number) {
				System.out.println(arr[i].charAt(0));
				String bookName = "";
				for (int j = 2; j < arr[i].length(); j++) {
					if (Character.isDigit(arr[i].charAt(j))) {
						break;
					}
					bookName = bookName + arr[i].charAt(j);

				}
				System.out.println(bookName);
			}
		}
	}

}
