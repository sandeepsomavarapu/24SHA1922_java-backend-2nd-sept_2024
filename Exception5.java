package com.ericsson.exceptions;

import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception5 {

	public static int validateLength(String name) throws Exception {
		if (name.length() > 6) {
			return name.length();
		} else {
			throw new FileNotFoundException("Invalid Name ...");
		}
	}

	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your name :");
		String ename = scan.next();
		Exception5.validateLength(ename);

	}

}
