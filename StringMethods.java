package com.ericsson.string;

public class StringMethods {

	public static void main(String[] args) {
		String orgname = "ericsson";// immutable  heap--->scp
		String orgname1 = "ericsson";// immutable
		String orgname2 = "ericsson";// immutable
		
		
			System.out.println(orgname.equals(orgname1));
			System.out.println(orgname==orgname1);//Object.equals()
			System.out.println(orgname.compareTo(orgname2));
			System.out.println("a".compareTo("A"));
			System.out.println("a".compareToIgnoreCase("A"));
			System.out.println("ericsson".equalsIgnoreCase("Ericsson"));
			System.out.println(orgname.charAt(2));
			System.out.println(orgname.indexOf("s"));
			System.out.println(orgname.lastIndexOf("s"));
			System.out.println("abcd".codePointAt(2));
			System.out.println("abcd".codePointBefore(2));
			System.out.println("welcome to india".length());
			System.out.println("  welcome to india   ".length());
			System.out.println("  welcome to india   ".trim().length());
			System.out.println("welcome to india".toUpperCase());
			System.out.println("welcome to india".contains("india"));
			System.out.println("welcome to india".endsWith("hyderabad"));
		
			System.out.println("a".compareTo("b"));
			System.out.println("ericsson".compareTo("ericsson"));
			System.out.println("z".compareTo("b"));
			
		
			
			StringBuffer sb=new StringBuffer("ericsson");//mutable
			StringBuffer sb1=new StringBuffer("ericsson");//mutable
			System.out.println(sb.equals(sb1));//false
			System.out.println(sb==sb1);//false
		
		//returns -ve if obj1 has to come before obj2
		//returns +ve if obj1 has to come after obj2  1
		//returns 0 if both are same


		
		
		
		
		
		
		
		
		
//		System.out.println(orgname.equals(orgname1));
//		System.out.println(orgname==orgname1);//Object.equals()
//		System.out.println(orgname1==orgname2);//Object.equals()
//		
//		
//		String orgname3=new String("welcome");
//		String orgname4=new String("welcome");
//		
//		System.out.println(orgname3.equals(orgname4));//true
//		System.out.println(orgname3==orgname4);//false
//		
		
		
		
		
//		System.out.println(orgname.concat(" india"));//un-referenced-->GC
//		System.out.println(orgname);//
//		StringBuffer sb=new StringBuffer("ericsson");//mutable
//			sb.append(" hyderabad");
//			System.out.println(sb);
//			//thread-safe
//			
//		StringBuilder sb1=new StringBuilder("ericsson");//mutable
//			sb1.append(" noida");
//			System.out.println(sb1);	
	}

}
