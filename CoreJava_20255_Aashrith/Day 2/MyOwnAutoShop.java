package com.sonata;

public class MyOwnAutoShop {

	public static void main(String[] args) 
	{
		Sedan s=new Sedan(2000000);
		s.length=10;
		s.f(s.length,2000000);
		Ford f1=new Ford(200000);
		f1.years=4;
		f1.manufacturerdiscount=20;
		double d1=200000;
		d1=d1-((f1.manufacturerdiscount)*d1/100);
		System.out.println("Ford car price is "+d1);
		Ford f2=new Ford(400000);
		f2.years=8;
		f2.manufacturerdiscount=20;
		double d2=600000;
		d2=d2-((f2.manufacturerdiscount)*d2/100);
		System.out.println("Ford car price is "+d2);
		Car c=new Car(200000);
		c.speed=50;
		c.color="blue";
		c.regularprice=400000;
		c.getsaleprice(c.regularprice);
		
	}

}
