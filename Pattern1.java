package com.ericsson.corejava;

import java.util.Iterator;
import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size for array");
		int arraySize = scan.nextInt();// 

		int array[] = new int[arraySize];// 5
		System.out.println("Enter the values to store in array:");
		for (int i = 0; i < array.length; i++) {// 5
			array[i] = scan.nextInt();
		}
		System.out.println(array);

		for (int i : array) {
			System.out.println(i);
		}

	}

}
