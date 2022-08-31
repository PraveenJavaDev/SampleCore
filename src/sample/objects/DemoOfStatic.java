package sample.objects;

public class DemoOfStatic {
	int num = 10;
	static int numb = 10;

	/*
	 * public DemoOfStatic() { num++; // increasing one number ex: 11
	 * System.out.println("calling Instance : " + num); numb++; // increasing one
	 * number ex: 11 System.out.println("calling static : " + numb); }
	 */

	public void method2() {
		System.out.println("Inside the Instance Method : " + numb);
		System.out.println("Inside the Instance Method : " + num);

	}

	public static void method1() {
		System.out.println("Inside the static Method : " + numb);

	}

	public static void main(String[] args) {
		
		  DemoOfStatic s1 = new DemoOfStatic();// ninstace number for s1 is 10 to 11
		  
		  DemoOfStatic s2 = new DemoOfStatic();// 11
		  
		  DemoOfStatic s3 = new DemoOfStatic();// 11
		 
		// accessing Static Variables

		System.out.println(DemoOfStatic.numb);

		 System.out.println(s1.numb);

		System.out.println(numb);

		method1();
		DemoOfStatic.method1();

	}

}
