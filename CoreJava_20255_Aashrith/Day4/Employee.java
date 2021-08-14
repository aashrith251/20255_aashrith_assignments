package com.sonata.assginment;
import java.util.*;
public class Employee 
{
	 int empid;
	String empname;
	 double empsal;
	 Employee(int empid,String empname,int empsal)
		{
			this.empid=empid;
			this.empname=empname;
			this.empsal=empsal;
		}
	
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", empsal=" + empsal + "]";
	}
	
	
}
