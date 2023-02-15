package com.rps.citi;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class MapEx {

	public int addOfTwo(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {
		MapEx obj=new MapEx();
		System.out.println("add of two int's :"+obj.addOfTwo(12, 13));
		
		TreeMap<Integer, String> emps = new TreeMap<Integer, String>();
		emps.put(123, "suresh");// key,value-->Entry
		emps.put(93, "hitesh");
		emps.put(658, "somesh");
		emps.put(996, "mahesh");
		emps.put(4567, "rajesh");
		emps.put(123, "naresh");

		System.out.println(emps);

		Set<Integer> keys = emps.keySet();

		Iterator<Integer> itr = keys.iterator();

		while (itr.hasNext()) {
			int key = itr.next();
			System.out.println(key + " " + emps.get(key));
		}

	}

}
