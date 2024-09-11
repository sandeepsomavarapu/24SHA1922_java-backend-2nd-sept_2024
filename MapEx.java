package com.ericsson.collections;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

//HashMap			duplicate keys are not allowed,values can be duplicate and insertion order is  not followed.

//LinkedHashMap    duplicate keys are not allowed,values can be duplicate and insertion order is  followed.

//SM/NM/TreeMap 	duplicate keys are not allowed,values can be duplicate and insertion order is  not followed 
//				but it follows sorting order of keys.

public class MapEx {

	public static void main(String[] args) {// dict
		TreeMap<Integer, String> studs = new TreeMap<Integer, String>();

		studs.put(111, "mahesh");
		studs.put(555, "kumar");
		studs.put(99, "vamshi");
		studs.put(232, "hitesh");
		studs.put(121, "pavan");
		studs.put(23, "manish");
		studs.put(111, "rajesh");

		System.out.println(studs);
//KeySet:

//		Set<Integer> keys = studs.keySet();
//
//		Iterator<Integer> itr = keys.iterator();
//
//		while (itr.hasNext()) {
//			int key = itr.next();
//			System.out.println(key + " " + studs.get(key));
//		}

//EntrySet

		Set<Entry<Integer, String>> entries = studs.entrySet();

		Iterator<Entry<Integer, String>> itr = entries.iterator();

		while (itr.hasNext()) {
			Entry<Integer, String> entry = itr.next();
			System.out.println(entry.getKey() + " " + entry.getValue());
		}


//		HashMap<Integer, String> studs1 = new HashMap<Integer, String>();
//
//		studs1.put(1, "ericsson");
//		studs1.putAll(studs);
//		System.out.println(studs1);
//		studs1.remove(23);
//		System.out.println(studs1.get(121));
//		System.out.println(studs1.containsKey(111));
//		System.out.println(studs1.containsValue("sandeep"));
//		System.out.println(studs1.replace(232, "devansh"));
//		System.out.println(studs1);
//		System.out.println(studs1.isEmpty());
//		studs1.clear();
//		System.out.println(studs1);
	}
}
