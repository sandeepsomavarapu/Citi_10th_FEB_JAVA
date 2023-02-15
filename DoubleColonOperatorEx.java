package com.rps.citi.java8;

import java.util.Date;

@FunctionalInterface
interface Calculator1 {
	public void calc(int number);

}

public class DoubleColonOperatorEx {
	public DoubleColonOperatorEx(int number) {
		System.out.println("Cube of given number" + (number * number * number));
	}
//	public static void cubeIt(int number) {
//		System.out.println("Cube of given number"+(number * number * number));
//	}

	public static void main(String[] args) {
		// DoubleColonOperatorEx obj = new DoubleColonOperatorEx();
		// instance,static,constructor
		Calculator1 obj1 = DoubleColonOperatorEx::new;
		obj1.calc(20);

		System.out.println(new Date());
	}

}
