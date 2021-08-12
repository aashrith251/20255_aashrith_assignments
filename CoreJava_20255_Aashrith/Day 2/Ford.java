package com.sonata;

public class Ford extends Car{
	int years;
	int manufacturerdiscount;
	Ford(int speed,double regularprice,String color,int years,int manufacturerdiscount)
	{
		super(speed,regularprice,color);
		this.years=years;
		this.manufacturerdiscount=manufacturerdiscount;
	}
	public double saleprice(int manufacturerdiscount,double regularprice)
	{
	   double d1=regularprice-((manufacturerdiscount)*regularprice/100);
		return d1;
	}

}
