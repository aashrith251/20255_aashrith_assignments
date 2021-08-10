package com.sonata.Day1;

public class ArrayReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5,6,7,8,9,10,};
		for(int i=0;i<(a.length/2);i++)
		{
			int t=a[i];
			a[i]=a[a.length-i-1];
			a[a.length-i-1]=t;
			
		}
		for(int i:a)
		{
			System.out.print(i+" ");
		}

	}

}
