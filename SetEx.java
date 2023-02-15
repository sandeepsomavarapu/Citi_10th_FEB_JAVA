package com.rps.citi;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

//not fixed in size 			ArrayList-->10  11,(CC*3/2)+1  16
//can hold  homogeneous and heterogeneous  data 		HashMap -16		TS,TM
//lots of utility methods
//duplicates are not allowed 
//insertion order is not preserved 

public class SetEx {

	public static void main(String[] args) {
	TreeSet ids=new TreeSet(new MyOrder());//COmparable->(2321).compareTo(229)
	
		ids.add(2321);	
		ids.add(229);	
		ids.add(627);	
		ids.add(327);	
		ids.add(3791);
		ids.add(2321);
		ids.add(2321);
		ids.add(625);	
		
		System.out.println(ids);
		Iterator<Integer> itr = ids.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		//Comparable-->NSO
		//Comparator -->compare CSO
		
		
		//interface ,marker ,functional   SAM
		
		
		System.out.println("citi".compareTo("djti"));
		
		//returns +ve if obj1 has to come after obj2
		//returns -ve if obj1 has to come before obj2
		//returns 0 if both are same 
	}

}
class MyOrder implements Comparator<Integer>
{

	@Override
	public int compare(Integer o1, Integer o2) {
		
		return o2.compareTo(o1);
	}
	


}
