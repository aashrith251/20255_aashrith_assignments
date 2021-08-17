package com.sonata.product;

import java.util.List;

import java.util.stream.Collectors;
public class mobile 
{
	public static void main(String[] args) 
	{
		List<product> p=Productdb.getproduct();
		p.stream().filter(p1->p1.getPcat()=="Mobile").forEach(System.out::println);
		product p3=p.stream().max((product1,product2)->product1.getPprice()>product2.getPprice() ? 1:-1).get();
		System.out.println("Max price is "+p3);
		List < product >p6 = p.stream()
	            .sorted((o1, o2) -> (int)(o1.getPprice() - o2.getPprice())).collect(Collectors.toList());
	        System.out.println(p6);
	     List < product >p7 = p.stream()
		            .sorted((o1, o2) -> (int)(o2.getPprice() - o1.getPprice())).collect(Collectors.toList());
	     System.out.println(p7);
	        
	        
	}
}
