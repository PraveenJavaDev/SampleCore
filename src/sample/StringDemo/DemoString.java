package sample.StringDemo;

public class DemoString {
	public static void main(String[] args) {

		String s = new String("canal");
		String s1 = new String("canal");

		String s2 = "praveen";
		String s3 = "praveen";

		String s4 = s2.concat("Kumar"); // praveen Kumar

		/*
		 * System.out.println(s2); // to read the each character from String
		 * 
		 * char ch = s.charAt(0); System.out.println(ch);
		 * 
		 * // to remove unwanted spaces we use trim method String name = "  canal ";
		 * System.out.println(name); System.out.println(name.trim()); // substring
		 * metthod will some part of string String sub = s.substring(1);
		 * System.out.println(sub); String sub1 = s.substring(2, 4);
		 * System.out.println(sub1); // to compare both Strings we are using compare
		 * method System.out.println(s.compareTo(s1));
		 */

		String st = "NewYork";
		String str = "Buston";
		System.out.println(st.compareTo(str));
		System.out.println("this city will be   : " + st + "and" + str);
		System.out.println(st + str);
		System.out.println(str.compareTo(st));

		if (st.compareTo(str) < 0) {
			System.out.println(st + str);

		} else {
			System.out.println(str + st);
		}
		String n = "CANAL";
		String n1 = "canal";
		System.out.println(st.contains("New"));
		System.out.println(st.contains("weN"));
		System.out.println(n.equalsIgnoreCase(n1));
		System.out.println(s.indent(4));
		str.indexOf('Y');
		System.out.println(st.indexOf('Y'));
		
		
	String name="3";
	String name1="4";
	if(name.compareTo(name1)<0) {
		System.out.println("String value"+name);
	}
	//.out.println("compare to cheack "+name.compareTo(name1)<0);
	
		

		/*
		 * System.out.println(s == s1); System.out.println(s2 == s3);
		 * System.out.println(s.equals(s1));
		 * 
		 * System.out.println(s.equals(s1));
		 */
	}

}
