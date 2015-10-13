package kr.ac.kookmin.exception.fileio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Makes numbered.txt the same as original.txt, but with each line numbered.
 */

public class AddLineNumber {
	public static void main(String[] args) {
		try {
			BufferedReader inputStream = new BufferedReader(new FileReader("C:\\original.txt"));
			PrintWriter outputStream = new PrintWriter(new FileOutputStream("C:\\numbered.txt"));

			int countNumber = 0;
			while (true) {
				String line = inputStream.readLine();
				if (line == null)
					break;
				countNumber++;
				outputStream.write(countNumber + " " + line);
				outputStream.write("\n");
			}
			inputStream.close();
			outputStream.close();

		} catch (IOException ex) {
			ex.printStackTrace();
			System.exit(1);
		}
	}
}
