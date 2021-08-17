package com.sonata;

public class Current extends BankApplication implements inter{
// TODO Auto-generated method stub
		public class Withdrawexception  extends Exception
		{
			Withdrawexception(String s1)
			{
				super(s1);
			}
		}
		@Override
		public double deposit(double amount) 
		{
			amount=this.getAccBal()+amount;
			return amount;
		}
		public double withDraw(double withdraw) throws Withdrawexception
		{
			if(withdraw>this.getAccBal())
			{
				throw new Withdrawexception ("Bal cannot be less than zero");
			}
			else
			{
				System.out.println("Withdraw Successfull");
				return this.getAccBal();
			}
		}
		public static void main(String[] args) throws Withdrawexception
		{
			
			Current b1=new Current();
			b1.setAccBal(100000);
			b1.setAccid(1234);
			b1.setAccName("aashrith");
			System.out.print(b1.withDraw(10000));

		}
}
