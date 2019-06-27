package com.itcast.io;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) throws IOException {
		File file = new File("a");
		String[] list = file.list();
		for (int i = 0; i < list.length; i++) {
			System.out.println(list[i]);
		}
		
//		File file = new File("a\\b");
//		file.mkdir();
//		file.delete();
//		File file2 = new File("b");
//		file2.delete();
////		file2.createNewFile();
//		System.out.println(file.exists());
//		System.out.println(file.isDirectory());
//		System.out.println(file.isFile());
//		System.out.println(file.getAbsolutePath());
//		System.out.println(file.getPath());
//		System.out.println(file.getParent());
//		System.out.println(file.getParentFile());
//		System.out.println(file.getName());
//		System.out.println(file.length());
	}
}
