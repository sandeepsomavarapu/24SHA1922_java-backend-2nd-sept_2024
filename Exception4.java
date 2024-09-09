package com.ericsson.exceptions;

public class Exception4 {
	public static void main(String[] args) {
		try {
			int a = 12 /0;//....
			try {
				int[] arr = new int[5];
				arr[5] = 23;
			} 
			catch (Exception exce) {
				System.out.println("Array index issue");
			} finally {
				System.out.println("Inner finaly");
			}
			System.out.println("remaining try statements");
		} catch (Exception exce) {
			System.out.println("Outer Catch Handled");
		}finally {
			System.out.println("outer finally");
		}
		System.out.println("remaining outer statements");
	}

}
