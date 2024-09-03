package com.ericsson.corejava;

import java.util.Scanner;

public class ScannerTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your employee Id :");
		int empid = scanner.nextInt();
		System.out.println("Enter your employee Name :");
		String empname = scanner.next();
		System.out.println("Enter your employee salary :");
		float salary = scanner.nextFloat();
		System.out.println("Enter your employee address :");
		String empadd = scanner.next();
		System.out.println("Enter your employee contact :");
		long contact = scanner.nextLong();
		System.out.println(empid + " " + empname + " " + salary + " " + empadd + " " + contact);
		scanner.close();

	}
}
