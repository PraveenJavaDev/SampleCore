package com.coding.corejava;

import java.util.Map;
import java.util.TreeMap;

public class DuplicatesinArr {
	public static void main(String[] args) {
		String arr[] = { "google", "facebook", "3", "facebook" };
		TreeMap<String, Integer> map = new TreeMap<>();
		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i]) + 1);
			} else {
				map.put(arr[i], 1);
			}
		}
	//	System.out.println(map);
		int max = 0;
		String name = "";
		for (Map.Entry<String, Integer> map1 : map.entrySet()) {
			if (max < map1.getValue()) {
				max = map1.getValue();
				name = map1.getKey();

			}
		}
		System.out.println(name);

	}

}
