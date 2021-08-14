package com.sonata.assginment;
import java.util.List;
import java.util.*;
public class Employeeimpl implements Employeeint
{
	
	

	@Override
	public void delemp(Employee e) 
	{
		
		
	}

	@Override
	public double yearsal(Employee e1) 
	{
		double d=e1.empsal*12;
		
		return d ;
	}

	@Override
	public double appsal(Employee e1) 
	{
		
		return 0;
	}
    ArrayList<Employee> l1=new ArrayList<>();
	
	public void addemp(Employee o) {
		l1.add(o);
	}
	public ArrayList<Employee> getemp(){
		return l1;
	}
	

}
