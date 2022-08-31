package com.coding.corejava;

public class AddNumbersInStrign {
	public static void main(String[] args) {
		String s = "123kjf78k3jju40ku";
		String num = "";
		int dummy = 0;
		int sum1 = 0;
		//List<String> list = new ArrayList<>();
		for (int i = 0; i < s.length(); i++) {
			if (Character.isDigit(s.charAt(i))) {
				dummy = 0;
				num = num + s.charAt(i);
			} else {
				dummy++;
			}

			if (dummy == 1) {
				//list.add(num);
				sum1 = sum1 + Integer.parseInt(num);
				num = "";

			}
		}
		System.out.println(sum1);
		/*
		 * int sum = 0; for (int i = 0; i < list.size(); i++) {
		 * System.out.println(list.get(i)); sum = sum + Integer.parseInt(list.get(i)); }
		 * System.out.println(sum);
		 */
	}

}
