package com.ericsson.exceptions;

import java.util.Scanner;

public class Validation {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the username :");
		String username = scan.next();
		System.out.println("Enter the password :");
		String password = scan.next();

		if (username.equalsIgnoreCase("ericsson") && password.equalsIgnoreCase("ericsson@123")) {
			System.out.println("Login Success !!!");
		} else {
			throw new InvalidCredentials("Invalid Username and Password !!!");
		}
	}

}
