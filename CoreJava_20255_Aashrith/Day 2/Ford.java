package com.sonata;

public class Ford extends Car{
	int years;
	Ford(int regularprice)
	{
		super(regularprice);
	}
	int manufacturerdiscount;
	public static void main(String[] args) 
	{
		Ford f=new Ford(200000);
		f.years=4;
		f.manufacturerdiscount=20;
		double d1=200000;
		d1=d1-((f.manufacturerdiscount)*d1/100);
		System.out.println("final price "+d1);
	}

}
