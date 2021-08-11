package com.sonata;

public class Car 
{
	int speed;
	double regularprice;
	String color;
	Car(int regularprice)
	{
		this.regularprice=regularprice;
	}
	public void getsaleprice(double d)
	{
		System.out.print("Sale Price is "+d);
	}
}
