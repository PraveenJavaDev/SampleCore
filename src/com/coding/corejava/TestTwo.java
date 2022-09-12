package com.coding.corejava;

public class TestTwo {
	public static int isSameReflection(String word1, String word2) {

		String word3 = "";
		int num = 0;

		for (int i = 0; i < word1.length(); i++) {
			if (word2.charAt(0) == word1.charAt(i)) {

				num = i;
				break;

			}

		}
		
		for (int j = 0; j <= word1.length(); j++) {
			if ( num>=word1.length() ) {

				num = 0;

			} else {
				word3 = word3 + word1.charAt(num);
				num++;
				

			}

		}
		System.out.println(word3);
		
		if (word3.equals(word2)) {
			return 1;
		} else {
			return -1;
		}

	}

	public static void main(String[] args) {

		System.out.println(isSameReflection("ab", "aa"));

	}
}
