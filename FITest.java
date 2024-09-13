package com.ericsson.java8;

import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FITest {

	public boolean check(int a) {
		if (a % 2 == 0)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		FITest obj=new FITest();
		Predicate<Integer> predicate =obj::check;
		System.out.println(predicate.test(99));
		System.out.println(predicate.test(2));

		Predicate<String> predicate1 = name -> name.length() > 6;

		System.out.println(predicate1.test("sandeep"));
		System.out.println(predicate1.test("akash"));

		IntPredicate intpredicate = i -> i * i > 0;
		System.out.println(intpredicate.test(12));

		BiPredicate<String, String> bipredicate = (name, fname) -> name.concat(fname).length() > 10;
		System.out.println(bipredicate.test("sandeep", "somavarapu"));

		Function<String, String> function = name -> name.toUpperCase();
		System.out.println(function.apply("sandeep"));

		Consumer<String> consumer = (name) -> System.out.println("After TRIM " + name.trim());

		consumer.accept("     welcome to india     ");

		Supplier<String> otps = () -> {
			String otp = "";
			for (int i = 1; i <= 4; i++) {
				otp = otp + (int) (Math.random() * 10);
			}
			return otp;
		};
		System.out.println(otps.get());
		System.out.println(otps.get());
		System.out.println(otps.get());

	}

}
