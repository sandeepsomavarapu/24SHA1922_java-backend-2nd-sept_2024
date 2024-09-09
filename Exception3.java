package com.ericsson.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception3 {

	public static void main(String[] args) {
		Scanner scan = null;
		try {//
			scan = new Scanner(System.in);
			int[] array = new int[5];
			System.out.println("Enter your Age: ");
			int age = scan.nextInt();
			System.out.println("Your age is : " + age);
			array[4] = 12 / 2;
			String name = null;
			System.out.println(array[4]);
			System.out.println(name.length());
			int value = Integer.parseInt(name);
			System.out.println("String Converted to Int " + value);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Maximum crossed...");
		} catch (ArithmeticException e) {
			System.out.println("Dont enter zero as denominator");
		} catch (InputMismatchException e) {
			System.out.println("Enter valid age in numbers ");
		} catch (Exception e) {
			System.out.println("Different exception :" + e.getClass());
		} finally {
			System.out.println("Executes everytime for clean up code");
			scan.close();
		}
	}
}
