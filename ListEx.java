package com.ericsson.collections;

import java.util.ArrayList;
import java.util.Iterator;
//Collection:

//1.homogeneous and heterogeneous objects 
//2.not fixed in size / growable in nature   
//3.lots of utility methods

//List:

//1.duplicates are allowed
//2.insertion order is followed

public class ListEx {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		names.add("suresh");
		names.add("mahesh");
		names.add("rajesh");
		names.add("somesh");
		names.add("kumar");
		names.add("akash");
		names.add("hitesh");
		names.add("mahesh");
		names.add(2, "qwerty");
		System.out.println(names);

		Iterator<String> itr = names.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

//		ArrayList names1 = new ArrayList();
//		names1.add("sundesh");
//		names1.add(123);
//		names1.add(true);
//		System.out.println(names1);
//		names1.addAll(names);
//		System.out.println(names1);
//		names1.remove("mahesh");
//		names1.add("mahesh");
//		System.out.println(names1);
//		System.out.println("Size : "+names1.size() );
//		System.out.println(names1.contains("sandeep"));
//		System.out.println(names1.get(3));
//		System.out.println(names1.indexOf("mahesh"));
//		System.out.println(names1.lastIndexOf("mahesh"));
//		System.out.println(names1.removeAll(names));
//	//	System.out.println(names1.retainAll(names));
//		System.out.println(names1);
//		names1.clear();
//		System.out.println(names1);
//		System.out.println(names1.isEmpty());
//		System.out.println();

	}

}
