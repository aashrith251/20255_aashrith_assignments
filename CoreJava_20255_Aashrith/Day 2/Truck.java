package com.sonata;

public class Truck extends Car {

	int weight;
	Truck(int speed,double regularprice,String color,int weight)
	{
		super(speed,regularprice,color);
		this.weight=weight;
	}
	public void getsaleprice(double d)
	{
		System.out.println("your final price is "+d);
	}
	public void saleprice(int weight,double regularprice)
	{
		if(weight>2000)
		{
			regularprice=regularprice-0.1*regularprice;
			getsaleprice(regularprice);
		}
		else
		{
			regularprice=regularprice-0.2*regularprice;
			getsaleprice(regularprice);
		}
	}

}
