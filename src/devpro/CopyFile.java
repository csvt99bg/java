package devpro;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFile {
	public static void main2() throws IOException {
		FileInputStream in = null;
		FileOutputStream out = null;

		try {
			in = new FileInputStream("D:/ab1.txt");
			out = new FileOutputStream("D:/test1.txt");

			int c;
			while ((c = in.read()) != -1) {
				out.write(c);
			}
		} finally {
			if (in != null) {
				in.close();
			}
			if (out != null) {
				out.close();
			}
		}
	}

	public static void testWriteTXT() throws IOException {
		FileWriter fileW = new FileWriter("D:/test.txt");
		BufferedWriter buff = new BufferedWriter(fileW);

		for (int i = 0; i < 60; i++) {
			buff.write("hello "+i);
			buff.newLine();
		}
		
		buff.close();
	}
}
