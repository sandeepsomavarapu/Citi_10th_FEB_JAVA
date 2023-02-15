package com.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamEx {
	public static void main(String[] args) {
		// stream of fixed number of integers
		Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
		stream.forEach(p -> System.out.println(p));

		// stream of arry
		Stream<Integer> stream1 = Stream.of(new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 });
		stream1.forEach(p -> System.out.println(p));

		List<Integer> list = new ArrayList<Integer>();

		for (int i = 1; i<=10; i++) {
			list.add(i);
		}
		
		Stream<Integer> stream2 = list.stream();
		stream2.forEach(p -> System.out.println(p));

		List<String> memberNames = new ArrayList<String>();
		memberNames.add("Amitabh");
		memberNames.add("Shekhar");
		memberNames.add("Aman");
		memberNames.add("Rahul");
		memberNames.add("Shahrukh");
		memberNames.add("Salman");
		memberNames.add("Yana");
		memberNames.add("Lokesh");
	}
}
