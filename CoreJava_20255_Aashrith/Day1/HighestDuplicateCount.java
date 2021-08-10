package com.sonata.Day1;

public class HighestDuplicateCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,2,3,4,5,2,3,2};
		int m=0;
		for(int i=1;i<a.length;i++)
		{
			int c=0;
			for(int j=0;j<=i;j++)
			{
				
				if(a[i]==a[j])
				{
					c=c+1;
				}
			}
			if(c>m)
			{
				m=c;
			}
		}
		System.out.print(m);

	}
}
