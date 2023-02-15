package com.rps.citi;

import java.util.ArrayList;
import java.util.Iterator;

//not fixed in size 			ArrayList-->10  11,(CC*3/2)+1  16
//can hold  homogeneous and heterogeneous  data 		HashMap -16		TS,TM
//lots of utility methods
//duplicates are allowed 
//insertion order is preserved 

public class ListEx {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();
		al.add("suresh");
		al.add("sandeep");
		al.add("naresh");
		al.add("mahesh");
		al.add("rajesh");
		al.add("somesh");
		al.add("naresh");

		System.out.println(al);

		Iterator<String> itr = al.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
