package com.sonata.Day2Assignment;

public class Product {
	private int ProID;
	private String ProName;
	private double ProPrice;
	
	public int getProID() {
		return ProID;
	}

	public void setProID(int proID) {
		ProID = proID;
	}

	public String getProName() {
		return ProName;
	}

	public void setProName(String proName) {
		ProName = proName;
	}

	public double getProPrice() 
	{
		return ProPrice;
	}

	public void setProPrice(double proPrice) {
		
		ProPrice =1.18* proPrice;
	}

	@Override
	public String toString() {
		return "Product [ProID=" + ProID + ", ProName=" + ProName + ", ProPrice=" + ProPrice + "]";
	}

	public static void main(String[] args)
	{
		Product p1=new Product();
		p1.setProID(1);
		p1.setProName("car");
		p1.setProPrice(750);
		Product p2=new Product();
		p2.setProID(2);
		p2.setProName("Bike");
		p2.setProPrice(1000);
		System.out.println(p1);
		System.out.println(p2);}

}
