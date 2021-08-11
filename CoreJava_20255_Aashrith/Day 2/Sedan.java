package com.sonata;

public class Sedan extends Car
{
	int length;
	Sedan(int regularprice)
	{
		super(regularprice);
	}
	public void getsaleprice(double d)
	{
		System.out.println("your final price is "+d);
	}
	public void f(int length,double regularprice)
	{
		if(length>20)
		{
			regularprice=regularprice-0.05*regularprice;
			getsaleprice(regularprice);
		}
		else
		{
			regularprice=regularprice-0.1*regularprice;
			getsaleprice(regularprice);
		}
	}
	public static void main(String[] args)
	{
		Sedan t=new Sedan(200000);
		t.length=220;
		t.f(t.length,t.regularprice);
	}
}
