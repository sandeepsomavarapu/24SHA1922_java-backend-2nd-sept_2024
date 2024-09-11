package com.ericsson.collections;

import java.util.Comparator;
import java.util.TreeSet;

//1.homogeneous and heterogeneous objects 
//2.not fixed in size / growable in nature   
//3.lots of utility methods

//Set:
//Hashset

//1.duplicates are not allowed
//2.insertion order is not followed

//Linked Hashset

//1.duplicates are not allowed
//2.insertion order is followed

//TreeSet

//1.duplicates are not allowed
//2.insertion order is not followed
//3.it follows sorting order(alphabetical order/ascending order)

public class SetEx {

	public static void main(String[] args) {

		TreeSet<String> emps = new TreeSet<String>(new MyOrder());
		emps.add("suresh");
		emps.add("naresh");
		emps.add("akash");
		emps.add("mahesh");
		emps.add("rajesh");
		emps.add("hitesh");
		emps.add("suresh");
		System.out.println(emps);//
		// Comparable-->FI-->compareTo-->NSO
		// Comparator-->FI-->compare-->CSO
	}

}

class MyOrder implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		return o2.compareTo(o1);
//		return -o1.compareTo(o2);
	}

}
