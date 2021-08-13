package com.sonata.dayassignments;

public abstract class Employeeabstract 
{
	int empid;
    String empname;
	double basicpay;
	int la;
	abstract double calsal(double basicpay);
	Employeeabstract(int empid,String empname,double basicpay,int la)
	{
		this.empid=empid;
		this.empname=empname;
		this.basicpay=basicpay;
		this.la=la;
	}
	@Override
	public String toString() {
		return "Employeeabstract [empid=" + empid + ", empname=" + empname + "]";
	}
	
	
}


