package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateEx {
public static void main(String[] args) {
	List<String> emps =
            Arrays.asList("suresh","mahesh","sandeep","ramakrishna","somesh","rajesh");
  
        Predicate<String> p = (s)->s.endsWith("esh");
        for (String st:emps)
        {   
            if (p.test(st))
                System.out.println(st);
        }
        emps.stream().forEach(System.out::println);
}
}
