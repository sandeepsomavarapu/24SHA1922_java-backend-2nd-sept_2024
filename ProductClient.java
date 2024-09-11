package com.ericsson.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ProductClient {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
//		Product product = new Product(123, "samsung", 42000, "electronics");
//
//		FileOutputStream fos = new FileOutputStream("products.txt");
//		ObjectOutputStream oos = new ObjectOutputStream(fos);
//		oos.writeObject(product);

		FileInputStream fos = new FileInputStream("products.txt");
		ObjectInputStream oos = new ObjectInputStream(fos);
		Product product=(Product) oos.readObject();
		System.out.println(product);

	}

}
