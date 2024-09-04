package com.ericsson.corejava;

public class ProductInfo {

	public static void main(String[] args) {// pid,pname,price,pcategory...
		
		int productId = Integer.parseInt(args[0]);

		String productName = args[1];
		
		float price=Float.parseFloat(args[2]);
		
		long serviceNo=Long.parseLong(args[3]);
		
		System.out.println(productId+" "+productName+" "+price+" "+serviceNo );

	}

}
