package com.sonata;

public class BankApplication
{
	// TODO Auto-generated method stub
			private int Accid;
			private String AccName;
			private double AccBal;

			public int getAccid() {
				return Accid;
			}
			public void setAccid(int accid) {
				Accid = accid;
			}
			public String getAccName() {
				return AccName;
			}
			public void setAccName(String accName) {
				AccName = accName;
			}
			public double getAccBal() {
				return AccBal;
			}
			public void setAccBal(double accBal) {
				AccBal = accBal;
			}
			public void display()
			{
				System.out.println(Accid);
				System.out.println(AccName);
				System.out.println(AccBal);
			}
			private double deposit;
			private double withdraw;	
			public double getDeposit() {
				return deposit+this.AccBal;
			}
			public void setDeposit(double deposit) {
				this.deposit = deposit+this.AccBal;
			}
			public double getWithdraw() {
				return withdraw;
			}
			public void setWithdraw(double withdraw) {
				this.withdraw = this.AccBal-withdraw;
			}
			
			@Override
			public String toString() {
				return "Bank [Accid=" + Accid + ", AccName=" + AccName + ", AccBal=" + AccBal + ", deposit=" + deposit
						+ ", withdraw=" + withdraw + "]";
			}
}
