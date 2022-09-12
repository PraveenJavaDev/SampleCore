package com.opps;

public class Employeedemo extends Employee {
	private String city;
	private String passportnum;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPassportnum() {
		return passportnum;
	}

	public void setPassportnum(String passportnum) {
		this.passportnum = passportnum;
	}

	public Employeedemo(int id, String name, String designation, double salary, String city, String passportnum) {
		super(id, name, designation, salary);
		this.city = city;
		this.passportnum = passportnum;
	}

	public Employeedemo() {
		// TODO Auto-generated constructor stub
	}
}
