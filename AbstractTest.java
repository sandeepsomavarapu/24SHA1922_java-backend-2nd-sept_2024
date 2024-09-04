package com.ericsson.oops;

import java.util.Date;

interface SuperParent {
	int salary = 90000;// public static final
	public static final String orgName = "Ericsson";

	void add(int a, int b);// public abstract void add(int a,int b)

	public abstract void sub(int a, int b);
}

abstract class Parent implements SuperParent {
	public abstract void printDate();

	public void printMsg() {
		System.out.println("am from Parent abstract class");
	}

}

public class AbstractTest extends Parent {

	public static void main(String[] args) {
		AbstractTest obj = new AbstractTest();
		obj.add(123, 21);
		obj.sub(21, 222);
		obj.printDate();
		obj.printMsg();
	}

	@Override // annotation
	public void add(int a, int b) {
		System.out.println("add of two numbers :" + (a + b));

	}

	@Override
	public void sub(int a, int b) {
		System.out.println("sub of two numbers :" + (a - b));
	}

	@Override
	public void printDate() {
		System.out.println("Today's Date" + new Date());

	}

}
