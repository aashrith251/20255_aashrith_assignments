package com.sonata.Day1;

public class TwoLargeNumbersInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,16,3,2,3,4,5,2,3,15};
		for(int i=1;i<a.length;i++)
		{
			
			for(int j=0;j<=i;j++)
			{
				if(a[j]>a[i])
				{
					int t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
				
			}
		}
		System.out.print(a[a.length-1]+" "+a[a.length-2]);

	}

}
