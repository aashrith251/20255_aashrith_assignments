package com.sonata.assginment;

import java.util.ArrayList;
import java.util.List;

public class Student {


	int stdid;
	String stdname;
	int stdmarks;
	public Student(int stdid,String stdname,int stdmarks)
	{
		this.stdid=stdid;
		this.stdmarks=stdmarks;
		this.stdname=stdname;
	}
	public int getStdid() {
		return stdid;
	}
	public void setStdid(int stdid) {
		this.stdid = stdid;
	}
	public String getStdname() {
		return stdname;
	}
	public void setStdname(String stdname) {
		this.stdname = stdname;
	}
	public int getStdmarks() {
		return stdmarks;
	}
	public void setStdmarks(int stdmarks) {
		this.stdmarks = stdmarks;
	}
	
	@Override
	public String toString() {
		return "Student [stdid=" + stdid + ", stdname=" + stdname + ", stdmarks=" + stdmarks + "]";
	}
	public static void main(String args[])
	{
		List<Student>s1=new ArrayList<Student>();
		s1.add(new Student(101,"a",200));
		s1.add(new Student(102,"d",300));
		s1.add(new Student(103,"c",100));
		s1.add(new Student(104,"b",400));
		s1.sort((Student a1,Student a2)-> a1.getStdmarks()-a2.getStdmarks());
		s1.forEach((s)->System.out.println(s));      
	}

}
