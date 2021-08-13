package com.sonata.dayassignments;

public class CustomException
{
    int sal;
		public class salaryexception  extends Exception
		{
			salaryexception(String s1)
			{
				super(s1);
			}
		}

		public void salary(int salary) throws salaryexception
		{
			if(salary<100000)
			{
				throw new salaryexception ("Salary cannot be less than 100000");
			}
			else
			{
				System.out.println("Your salary is "+salary);
			}
		}
		public static void main(String[] args) throws salaryexception
		{
			
			CustomException e1=new CustomException();
		    e1.sal=100000;
			e1.salary(e1.sal);

		}

}
