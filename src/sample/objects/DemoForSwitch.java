package sample.objects;

import java.util.Scanner;

public class DemoForSwitch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter any number");
		int num = sc.nextInt();
		

		// int num = 10;

		switch (num) {
		case 10:
			System.out.println("case1" + num);
			break;
		case 20:
			System.out.println("case2" + num);
			break;
		case 30:
			System.out.println("case3" + num);
			break;
		case 40:
			System.out.println("case4" + num);
			break;

		default:
			System.out.println("default" + num);
			break;
		}

	}
}
