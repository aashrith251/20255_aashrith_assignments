package com.sonata;

public class Sedan extends Car
{
	int length;
	Sedan(int speed,double regularprice,String color,int length)
	{
		super(speed,regularprice,color);
		this.length=length;
	}
	public void getsaleprice(double d)
	{
		System.out.println("Sedan car price is "+d);
	}
	public void saleprice(int length,double regularprice)
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
}
