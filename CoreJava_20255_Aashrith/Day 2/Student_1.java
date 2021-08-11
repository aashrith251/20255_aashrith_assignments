package com.sonata.Day2Assignment;

public class Student_1 {
	private int stdID;
	private String stdName;
	private int stdClass;
	

	

	@Override
	public String toString() {
		return "Student_1 [stdID=" + stdID + ", stdName=" + stdName + ", stdClass=" + stdClass + "]";
	}



	public int getStdID() {
		return stdID;
	}



	public void setStdID(int stdID) {
		this.stdID = stdID;
	}



	public String getStdName() {
		return stdName;
	}



	public void setStdName(String stdName) {
		this.stdName = stdName;
	}



	public int getStdClass() {
		return stdClass;
	}



	public void setStdClass(int stdClass) {
		this.stdClass = stdClass;
	}



	public static void main(String[] args)
	{
		Student_1 c1=new Student_1();
		c1.setStdClass(10);
		c1.setStdID(22);
		c1.setStdName("Aashrith");
		Student_1 c2=new Student_1();
		c2.setStdClass(20);
		c2.setStdID(24);
		c2.setStdName("Kushlu");
		System.out.println(c1);
		System.out.println(c2);
	}
}
