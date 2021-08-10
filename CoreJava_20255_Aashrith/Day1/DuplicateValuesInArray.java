package com.sonata.Day1;

public class DuplicateValuesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,2,3,4,5,2,3};
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
			if(c==2)
			{
				System.out.print(a[i]+" ");
			}
		}

	}

}
