package com.sonata.dayassignments;

public class staff extends Employeeabstract
{

	staff(int empid,String empname,double basicpay,int la)
	{
		super(empid,empname,basicpay,la);
	}
	double calsal(double basicpay)
	{
		double sal=basicpay+0.18*basicpay;
		return sal;
	}
	public static void main(String args[])
	{
		staff s=new staff(5,"Aashrith",600000,20);
		System.out.print(s);
		
	}
	@Override
	public String toString() {
		return "staff [empid=" + empid + ", empname=" + empname + "]";
	}
}	