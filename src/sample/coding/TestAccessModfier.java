package sample.coding;

import sample.arrays.AccessModifierDemo;

public class TestAccessModfier extends AccessModifierDemo {
	public static void main(String[] args) {
		AccessModifierDemo acc = new AccessModifierDemo();
		 System.out.println(acc.num3);
		TestAccessModfier tacc = new TestAccessModfier();
		System.out.println(tacc.num2);
		System.out.println(tacc.num3);

	}

}
