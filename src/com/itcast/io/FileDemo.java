package com.itcast.io;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) throws IOException {
		FileReader fr = null;
		try {
			fr = new FileReader(new File("a\\a.txt"));
			char[] buf = new char[4];
			int len;
			while((len = fr.read(buf)) != -1) {
				System.out.println(new String(buf, 0, len));
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fr != null) {
				try {
					fr.close();
				} catch (IOException e2) {
					e2.printStackTrace();
				}
			}
		}
	}
}
