package com.hll.ssm.test;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
	
	public static void print(Class c){
		System.out.println("Is c interface ? " + c.isInterface());
		System.out.println(c.getName());
		System.out.println(c.getSimpleName());
	}
	
	public static void main(String[] args) throws ClassNotFoundException {
		Class a = Class.forName("com.hll.ssm.test.A");
		Class b = Class.forName("com.hll.ssm.test.B");
		Class c = Class.forName("com.hll.ssm.test.C");
		print(a);
		print(b);
		print(c);
		
	}
}

class B{
	
}

interface C{
	
}

class A{
	private String s;
	
	

	public A() {
		super();
	}

	public A(String s) {
		super();
		this.s = s;
	}

	public String getS() {
		return s;
	}

	public void setS(String s) {
		this.s = s;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "A:" + "s = " +s;
	}
	
	
}
