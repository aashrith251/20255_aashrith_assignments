package com.sonata;

public class Car 
{
	int speed;
	double regularprice;
	String color;
	Car(int speed,double regularprice,String color)
	{
		this.speed=speed;
		this.regularprice=regularprice;
		this.color=color;
	}
	public void getsaleprice(double d)
	{
		System.out.print("Car price is "+d);
	}
}
