package com.sonata.dayassignments;

public class Shape {
	double length;
	double height;
	double width;
	Shape(double length,double height,double width)
	{
		this.length=length;
		this.height=height;
		this.width=width;
	}
	public double area(double length,double height,double width)
	{
		return length*height*width;
	}
	public static void main(String[] args) 
	{
		triangle t=new triangle(2,3,4);
		System.out.println(t.area(t.length,t.height,t.width));
	}

}
class triangle extends Shape
{
	triangle(double length,double height,double width)
	{
		super(length,height,width);
	}
	public double area(double length,double height,double width)
	{
		double a1=0.5*height*length;
		return a1;
	}
}
class square extends Shape
{
	square(double length,double height,double width)
	{
		super(length,height,width);
	}
	public double area(double length,double height,double width)
	{
		double a2=length*length;
		return a2;
	}
}
class rectangle extends Shape
{
	rectangle(double length,double height,double width)
	{
		super(length,height,width);
	}
	public double area(double length,double height,double width)
	{
		double a3=length*width;
		return a3;
	}
}

