package com.rps.citi.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class WithStream {
	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		names.add("Ajeet");
		names.add("Negan");
		names.add("Aditya");
		names.add("Steve");

		// Using Stream and Lambda expression
		long count = names.parallelStream().filter(str -> str.length() < 6).count();//collect.toList
		System.out.println("There are " + count + " strings with length less than 6");
		List<String> result = names.stream().filter(str -> str.length() < 6).collect(Collectors.toList());//collect.toList
		System.out.println(result);
	}
}