package com.ericsson.io;

import java.io.File;
import java.io.IOException;

public class FileEx {

	public static void main(String[] args) throws IOException {
		File file = new File("notes");
		System.out.println(file.mkdir());
		System.out.println(file.createNewFile());
		System.out.println(file.canRead());
		System.out.println(file.canWrite());
		System.out.println(file.getAbsolutePath());
		System.out.println(file.exists());
		System.out.println(file.getFreeSpace());
		System.out.println(file.getTotalSpace());
		System.out.println(file.getUsableSpace());
		System.out.println(file.isDirectory());
		System.out.println(file.isFile());
		System.out.println(file.setReadOnly());
		System.out.println("created");

	}

}
