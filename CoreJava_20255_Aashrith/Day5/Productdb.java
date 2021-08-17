package com.sonata.product;

import java.util.ArrayList;
import java.util.List;
public class Productdb 
{
	public static List<product> getproduct(){
		List<product> list=new ArrayList();
		list.add(new product(1,"Nokia","Mobile",5000));
		list.add(new product(3,"Puma","Shoes",9000));
		list.add(new product(2,"NIke","Mobile",4000));
		list.add(new product(4,"Oneplus","Mobile",7000));
		return list;
	}
}
