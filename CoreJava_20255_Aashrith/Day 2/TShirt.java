package com.sonata.Day2Assignment;

public class TShirt {
	String color;
	String material;
	String design;
	int size;
	TShirt(String c,String m,String design,int s)
	{
		this.color=c;
		this.material=m;
		this.design=design;
		this.size=s;
	}
	public void small()
	{
		System.out.print("size is small");
	}
	public void large()
	{
		System.out.print("size is large");
	}
	public void xtralarge()
	{
		System.out.print("size is xtra-large");
	}
	
	public static void main(String[] args)
	{
		TShirt t1=new TShirt("blue","cotton","red",10);
	    TShirt t2=new TShirt("blue","cotton","red",20);
		TShirt t3=new TShirt("blue","cotton","red",30);
		if(t1.size>10 && t1.size<20)
		{
			t1.large();
		}
		else if(t1.size>20 )
		{
			t1.xtralarge();
		}
		else
		{
			t1.small();
		}
	}

}
