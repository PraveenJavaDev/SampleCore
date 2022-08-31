package sample.objects;

public class DemoforVariables {
	int number = 20;// instance Variable
	static int number1 = 20;

	void method1() {
		int num = 10;// local Variable
		
		

		System.out.println("inside the  method1 : " + num);
		System.out.println("inside the method1 accessing Instance variable : " + number);

	}

	void method2() {
		
		System.out.println("inside the method2 accessing Instance variable :" + number);
	}

	public static void main(String[] args) {
			
		DemoforVariables dv = new DemoforVariables();// creating an object
		
		dv.method1();
		dv.method2();
		
		DemoforVariables dv1 = new DemoforVariables();
		dv1.method1();
		dv1.method2();
		
		

	}

}
