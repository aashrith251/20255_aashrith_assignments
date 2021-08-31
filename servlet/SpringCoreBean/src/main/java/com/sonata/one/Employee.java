package com.sonata.one;

public class Employee {
	private int id;
	private String name;
	private Address add;
	public Employee(int id, String name, Address add) {
		super();
		this.id = id;
		this.name = name;
		this.add = add;
	}
	public void display()
	{
		System.out.println(id+" "+name);
		System.out.println(add.toString());
	}
}
