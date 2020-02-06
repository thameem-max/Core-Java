package com.thameemun.inheritance;

/*
 *  Note : Inheritance should be used if the relationship is used throughout the object otherwise use aggregation it is best choice
 */
public class Aggregation {
	public static void main(String[] args) {
		Address add = new Address("California", "USA", "999999");
		Employee employee = new Employee("E0000001", "Thams", add);
		System.out.println(employee);
	}
}

class Employee {
	String employeeId;
	String name;
	Address address;

	public Employee(String employeeId, String name, Address address) {
		super();
		this.employeeId = employeeId;
		this.name = name;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", name=" + name + ", address=" + address + "]";
	}

}

class Address {
	String city;
	String country;
	String pinCode;

	public Address(String city, String country, String pinCode) {
		super();
		this.city = city;
		this.country = country;
		this.pinCode = pinCode;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", country=" + country + ", pinCode=" + pinCode + "]";
	}

}
