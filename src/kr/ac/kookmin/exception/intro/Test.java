package kr.ac.kookmin.exception.intro;

import java.io.*;

class AAA {
	private BufferedReader in;

	public void readFile() {
		try {
			this.in = new BufferedReader(new FileReader("C:\\a.txt"));
			System.out.println("파일을 열었습니다.");

			while (true) {
				String line = in.readLine();
				if (line == null)
					break;

				System.out.println(line);
			}
		}

		catch (IOException ex) {
			ex.printStackTrace();
			System.exit(1);
		} 
		finally {
			fileClose(in);
		}
	}

	public void fileClose(Closeable c) {
		try {
			c.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("파일을 닫았습니다.");
	}
}

public class Test {

	public static void main(String[] args) {
		AAA a = new AAA();
		a.readFile();
	}

}
