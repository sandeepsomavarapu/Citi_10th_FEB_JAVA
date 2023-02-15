package com.java8;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;

//Q)write a program to check if a number is a single digit number or not using Lambda expression?
//Q)write a program to supply 4 digit random OTPs using Lambda expression
//Q)Write a program to print names which are ending "esh" from"suresh","mahesh","sandeep","ramakrishna","somesh","rajesh".
//	using Lambda expression
public class Java8Tasks {
public static void main(String[] args) {
	
	List<String> names=Arrays.asList("suresh","mahesh","sandeep","ramakrishna","somesh","rajesh");
	
		Predicate<String> predicate=name->name.endsWith("esh");//test
		
		for(String emp:names)
		{
			if(predicate.test(emp)) {System.out.println(emp);};
		}
		
	
	Predicate<Integer> p=i->(i>-10)&&(i<10);
	System.out.println(p.test(-1));
	
	Supplier<String> otps=()->{
		String otp="";
		for(int i=1;i<=4;i++)
		{
			otp=otp+(int)(Math.random()*10);
		}
		return otp;
		
	};
	System.out.println(otps.get());
	System.out.println(otps.get());
}
}
