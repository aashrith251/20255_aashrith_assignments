package com.sonata.assginment;
import java.util.*;
import com.sonata.employeecollection.duplicate;
import com.sonata.employeecollection.employee;
public class Useremployee
{
	public static int compareTo(Employee st,Employee st1)
	{
		if(st1.empid==st.empid) 
		{
			
			return 0;
		}
		else
		{
			return 1;
		}
	}
	public void calyearlysal(ArrayList<Employee>s2)
	{
		for(Employee a1:s2)
		{
			Employeeimpl A=new Employeeimpl();
			System.out.println("Yearly salary of "+a1.empname+"is "+A.yearsal(a1)+" ");
		}
	}
	public static void main(String args[]) throws duplicate
	{
		Useremployee u1=new Useremployee();
		Employee e1=new Employee(1,"Aashrith",100000);
		Employee e2=new Employee(2,"B",200000);
		Employee e3=new Employee(3,"C",300000);
		Employee e4=new Employee(3,"D",4000);
		
		ArrayList<Employee> l1=new ArrayList<>();
		l1.add(e1);
		l1.add(e2);
		l1.add(e3);
		l1.add(e4);
		System.out.println(l1);
		for(Employee a1:l1)
		{
			if(a1.empsal<=5000)
			{
				a1.empsal=10000;
			}
		}
		u1.calyearlysal(l1);
		System.out.println(l1);
		for(Employee a1:l1)
		{
			for(Employee a2:l1)
			{
				if(a1==a2)
				{
					continue;
				}
				else if(compareTo(a1,a2)==0)
				{
					throw new duplicate("Duplicate Employee");
				}
			}
		}
	}
}
