package com.ericsson.oops;

class Caluculator {
	int result = 123;

	public void addition(int a, int b) {
		System.out.println("add of two numbers :" + (a + b));
	}

	public void sub(int a, int b) {
		System.out.println("sub of two numbers :" + (a - b));
	}
}

class LaptopCaluculator extends Caluculator {

	public void division(int a, int b) {
		System.out.println("div of two numbers :" + (a / b));
	}

	public void mod(int a, int b) {
		System.out.println("sub of two numbers :" + (a % b));
	}
}

public class MobileCalCulator extends Caluculator {
	public void mul(int a, int b) {
		System.out.println("mul of two numbers :" + (a * b));
	}

	public static void main(String[] args) {

		MobileCalCulator calci = new MobileCalCulator();
		calci.mul(12, 2);
		calci.addition(12, 13);
		calci.sub(21, 90);// ctrl+shift+f-->to format the file,ctrl+/
//		calci.division(12, 5);
//		calci.mod(12, 8);
		System.out.println(calci.result);
	}
}
