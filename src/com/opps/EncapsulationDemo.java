package com.opps;

public class EncapsulationDemo {
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setId(12);
		System.out.println(emp.getId());
		Employee emp1=new Employee(12, "canal", "software",10000.00);
		System.out.println(emp1.getName());
		System.out.println(emp1);

	}

}
