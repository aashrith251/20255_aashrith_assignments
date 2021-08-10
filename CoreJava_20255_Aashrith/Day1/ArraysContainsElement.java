package com.sonata.Day1;

public class ArraysContainsElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5,6,7,8,9,10};
		int s=7;
		boolean b=false;
		for(int i=0;i<a.length;i++)
		{
			if(s==a[i])
			{
				b=true;
			}
		}
		System.out.print(b);

	}

}
