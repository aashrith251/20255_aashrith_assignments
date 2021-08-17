package com.sonata;

public interface inter
{
	public double deposit(double amount);
	public double withDraw(double amount) throws Withdrawexception, com.sonata.Current.Withdrawexception;
}
class Withdrawexception  extends Exception
{
	Withdrawexception(String s1)
	{
		super(s1);
	}
}
