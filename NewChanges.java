package com.Exceptions;

public class NewChanges 
{
	public static void main(String[] args) {
try {
	int a=10/2;
	int a1[]=new int[3];
	a1[0]=123;
	a1[3]=1234;
} catch (ArithmeticException | ArrayIndexOutOfBoundsException |NumberFormatException e) {
	//System.out.println(e);
	//e.printStackTrace();
	System.out.println(e.getMessage());
}
	}
}
//throw(user defined exception)

//throws(it will give indication to calling environment)