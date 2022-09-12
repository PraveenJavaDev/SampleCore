package sample.arrays;

public class AccessModifierDemo {
	// access within the class
	private int num = 10;
	// within the package
	int num1 = 20;
	// outside the packge by inheriting the class
	protected int num2 = 30;

	// access enywher
	public int num3 = 40;

	public static void main(String[] args) {
		AccessModifierDemo acc = new AccessModifierDemo();
		System.out.println(acc.num);
		System.out.println(acc.num1);
		System.out.println(acc.num2);
		System.out.println(acc.num3);

	}

}
