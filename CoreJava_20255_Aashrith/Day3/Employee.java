package com.sonata.dayassignments;

public class Employee 
{
	int empid;
	String name;
	double empsal;
	Employee(int empid,String name,Double empsal)
	{
		this.empid=empid;
		this.name=name;
		this.empsal=empsal;
	}
	public void display()
	{
		System.out.print(empid+" "+name+" "+empsal);
	}
	public double salcal(double sal)
	{
		double s=sal;
		return s;
	}
	public static void main(String args[])
	{
		manager m=new manager(2,"as",20.4);
		System.out.print(m.salcal(m.empsal));
	}
}
class manager extends Employee
{

	manager(int empid, String name, Double empsal) {
		super(empid, name, empsal);
	}
	
	public double salcal(double sal)
	{
		double s=2*sal;
		return s;
	}
}
class developer extends Employee
{

	developer(int empid, String name, Double empsal) {
		super(empid, name, empsal);
	}
	
	public double salcal(double sal)
	{
		double s=1.5*sal;
		return s;
	}
}
class tester extends Employee
{

	tester(int empid, String name, Double empsal) {
		super(empid, name, empsal);
	}
	
	public double salcal(double sal)
	{
		double s=sal;
		return s;
	}
}


