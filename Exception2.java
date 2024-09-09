package com.ericsson.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception2 {

	public static void main(String[] args) {
		int fnum = 0;
		int snum = 0;
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter first number for division: ");
		try {
			fnum = scan.nextInt();
			System.out.println("Enter second number for division: ");
			snum = scan.nextInt();
		} catch (InputMismatchException exce) {
			System.out.println("Please enter only numbers");
		}
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
