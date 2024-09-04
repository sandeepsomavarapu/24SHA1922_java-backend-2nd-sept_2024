package com.ericsson.oops;

interface Parent1 {
	public void m1() ;
}

interface Parent2 {

	public void m1() ;
}

public class Child implements Parent1,Parent2{

	public static void main(String[] args) {
		Child child=new Child();
		child.m1();
	}

	@Override
	public void m1() {
		System.out.println("child implementation for parent method");
		
	}

}
