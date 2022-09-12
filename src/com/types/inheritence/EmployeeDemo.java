package com.types.inheritence;

public class EmployeeDemo extends Employee {
	@Override
	public void method1(int a,int b) {
		super.method1(a,b);
		int sum=a*b;
		System.out.println(sum);
		System.out.print("EmployeeDemo inside method1");
	}

	@Override
	public void method2() {
		super.method2();
		System.out.println("EmployeeDemo inside method2");

	}

	public static void main(String[] args) {
		EmployeeDemo demo = new EmployeeDemo();
		demo.method1(10,12);

	}

}
