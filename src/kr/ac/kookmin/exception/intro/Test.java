package kr.ac.kookmin.exception.intro;

import java.io.*;

class AAA {
	private BufferedReader in;

	public void readFile() {
		try {
			this.in = new BufferedReader(new FileReader("C:\\a.txt"));
			System.out.println("������ �������ϴ�.");

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
		System.out.println("������ �ݾҽ��ϴ�.");
	}
}

public class Test {

	public static void main(String[] args) {
		AAA a = new AAA();
		a.readFile();
	}

}
