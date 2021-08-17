
package com.sonata.product;

public class product 
{
		private int pid;
		private String pname;
		private String pcat;
		private int pprice;
		public product(int pid, String pname, String pcat, int pprice) 
		{
			super();
			this.pid = pid;
			this.pname = pname;
			this.pcat = pcat;
			this.pprice = pprice;
		}
		public int getPid() {
			return pid;
		}
		public void setPid(int pid) {
			this.pid = pid;
		}
		public String getPname() {
			return pname;
		}
		public void setPname(String pname) {
			this.pname = pname;
		}
		public String getPcat() {
			return pcat;
		}
		public void setPcat(String pcat) {
			this.pcat = pcat;
		}
		public int getPprice() {
			return pprice;
		}
		public void setPprice(int pprice) {
			this.pprice = pprice;
		}
		@Override
		public String toString() {
			return "product [pid=" + pid + ", pname=" + pname + ", pcat=" + pcat + ", pprice=" + pprice + "]";
		}
		
}
