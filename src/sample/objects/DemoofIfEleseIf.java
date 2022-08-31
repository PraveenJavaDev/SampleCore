package sample.objects;

public class DemoofIfEleseIf {
	public static void main(String[] args) {
		int age = 17;

		System.out.println(age < 18);
     //if condition Example
		/*
		 * if (age > 18 || age < 60) {
		 * System.out.println("print age is greater than 18   age is : " + age); }
		 */

		// if-else condition Example
		if (age > 18 && age < 60) {
			System.out.println("print age is greater than 18   age is : " + age);
		}else {
			System.out.println("print age is not between 18 and 60  age is : " + age);
		}

	}

}
