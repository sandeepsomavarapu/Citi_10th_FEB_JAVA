package com.rps.citi.java8;

@FunctionalInterface
interface Calculator {
	public int calc(int a, int b);
	public default void commonMethod()
	{
		
	}
	public static void commonMethod2()
	{
		
	}
}

interface A {
	public int calc(int a, int b);
	
}

public class LamdaExpressionsEx1 implements Calculator{

	public static void main(String[] args) {
		Calculator c = (a, b) -> a + b;
		System.out.println(c.calc(12, 3));
		Calculator c1 = (a, b) -> a - b;
		System.out.println(c1.calc(12, 3));
	}

	@Override
	public int calc(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
