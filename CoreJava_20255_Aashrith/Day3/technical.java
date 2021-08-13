package com.sonata.dayassignments;

public class technical extends Employeeabstract {
	technical(int empid,String empname,double basicpay,int la)
	{
		super(empid,empname,basicpay,la);
	}
	public double calsal(double basicpay)
	{
		double sal=basicpay+0.12*basicpay;
		return sal;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 technical t=new technical(5,"aashrith",600000,20);
		System.out.print(t);

	}
	@Override
	public String toString() {
		return "technical [empid=" + empid + ", empname=" + empname + "]";
	}

}
