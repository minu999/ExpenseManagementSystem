package com.ibm.rest.webservices.restwebservices.helloWorld;

public class HelloWorldBean{

	private String s;

	public HelloWorldBean(String s)
	{
		this.s=s;
	}

	public String getS() {
		return s;
	}

	public void setS(String s) {
		this.s = s;
	}

	@Override
	public String toString() {
		return "HelloWorldBean [s=" + s + "]";
	}
	
}
