package com.sonata;

public class MyOwnAutoShop {

	public static void main(String[] args) 
	{
		Sedan s=new Sedan(50,2000000,"Black",20);
		Ford f1=new Ford(60,4000000,"Green",3,20);
		Ford f2=new Ford(80,8000000,"Pink",5,40);
		Car c=new Car(90,250000,"White");
		s.saleprice(s.length, s.regularprice);
		System.out.println("Ford car price is "+f1.saleprice(f1.manufacturerdiscount, f1.regularprice));
		System.out.println("Ford car price is "+f2.saleprice(f2.manufacturerdiscount, f2.regularprice));
		c.getsaleprice(c.regularprice);
		
	}

}
