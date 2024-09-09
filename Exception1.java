package com.ericsson.exceptions;

import java.util.Scanner;

public class Exception1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first number for division: ");
		int fnum = scan.nextInt();
		System.out.println("Enter second number for division: ");
		int snum = scan.nextInt();
		try {
			int division = fnum / snum;// AE
			System.out.println("Division of two numbers  : " + division);
		} catch (ArithmeticException exception) {
			System.out.println("Denominator cannot be zero");
		}
		System.out.println("Remaining lines of code");

		scan.close();
	}

}
