package sample.StringDemo;

import java.util.Scanner;

public class CompareToMethodExmaple {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first cityname");
		String name = sc.nextLine();
		System.out.println("Enter the second City name");
		String name1 = sc.nextLine();
		System.out.println("comparing value : "+name.compareTo(name1));

		if (name.compareTo(name1) < 0) {
			System.out.println("the citys are in alphbetical order  :" + name + " " + name1);
		} else {
			System.out.println("the citys are in alphbetical order :" + name1 + " " + name);
		}

	}

}
