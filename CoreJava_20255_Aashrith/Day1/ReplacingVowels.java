package com.sonata.Day1;

public class ReplacingVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="aashrith";
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c=='a' || c=='e'||c=='i'||c=='o'||c=='u')
			{
				s=s.replace(c, '$');
			}
		}
		System.out.print(s);
	}

}
