package com.ericsson.java8;

@FunctionalInterface
interface Calculator {
	public int caluculate(int a, int b);
	public default void m1()
	{
		
	}
}

public class LambdaTest {
	public static void main(String[] args) {
		Calculator calci = (a, b) -> a + b;
		System.out.println(calci.caluculate(12, 12));
		Calculator calci1 = (a, b) -> a - b;
		System.out.println(calci1.caluculate(12, 9));
	}

}
