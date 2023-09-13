package com.demo.model;

import org.springframework.hateoas.RepresentationModel;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//@AllArgsConstructor
//@NoArgsConstructor
//@Getter
//@Setter
//@ToString
public class Employee extends RepresentationModel<Employee> {
	
	String name;
	int mobile;
	Address address;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, int mobile, Address address) {
		super();
		this.name = name;
		this.mobile = mobile;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMobile() {
		return mobile;
	}

	public void setMobile(int mobile) {
		this.mobile = mobile;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", mobile=" + mobile + ", address=" + address + "]";
	}
	
	
	
	
	
	
	
}
