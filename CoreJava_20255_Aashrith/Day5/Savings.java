package com.sonata;
public class Savings extends BankApplication implements inter
{
	
	public double deposit(double amount)
	{
		amount=amount+this.getAccBal();
		System.out.print("Deposited");
		return amount;
	}
	@Override
	public double withDraw(double amount) {
		// TODO Auto-generated method stub
		amount=this.getAccBal()-amount;
		return amount;
	}
	public static void main(String args[])
	{
		Savings c1=new Savings();
		c1.setAccBal(100000);
		c1.setAccid(1234);
		c1.setAccName("aashrith");
		System.out.print("Account bal is"+c1.deposit(1000));
		System.out.print("Account bal is"+c1.withDraw(1000));
	}

}
