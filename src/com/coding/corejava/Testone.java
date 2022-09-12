package com.coding.corejava;

public class Testone {
	public static int unaffectedchar(String dataStream) {
		int answer = 0;

		StringBuffer sb = new StringBuffer(dataStream);
		sb.reverse();
		for (int i = 0; i < dataStream.length(); i++) {
			if (dataStream.charAt(i) == sb.charAt(i)) {
				answer++;
			}
		}
		return answer;

	}

	public static void main(String[] args) {
		String name = "inspiringte";

	}
}
