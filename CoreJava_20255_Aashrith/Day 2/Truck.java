package com.sonata;

public class Truck extends Car {

	int weight;
     Truck(int regularprice)
	{
		super(regularprice);
	}
	public void getsaleprice(double d)
	{
		System.out.println("your final price is "+d);
	}
	public static void main(String[] args)
	{
		Truck t=new Truck(200000);
		t.weight=1001;
		if(t.weight>2000)
		{
			t.regularprice=t.regularprice-0.1*t.regularprice;
			t.getsaleprice(t.regularprice);
		}
		else
		{
			t.regularprice=t.regularprice-0.2*t.regularprice;
			t.getsaleprice(t.regularprice);
		}
		

	}

}
