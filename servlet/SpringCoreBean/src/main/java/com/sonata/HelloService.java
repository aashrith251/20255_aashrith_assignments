package com.sonata;

public class HelloService 
{
	private String name;
	private String sub;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSub() {
		return sub;
	}
	public void setSub(String sub) {
		this.sub = sub;
	}
	public String sayHello()
	{
		return "Hello!"+name+sub;
	}
}
