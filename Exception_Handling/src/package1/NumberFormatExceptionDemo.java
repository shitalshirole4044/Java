package package1;

import java.io.*;

//RuntimeException-IllegalArgumentException(parent of NumberFormatException)
//						NumberFormatException(child)
public class NumberFormatExceptionDemo {
	void getData() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int data = Integer.parseInt(br.readLine()); // data=shashi

	}

	public static void main(String[] args) throws Exception {
		NumberFormatExceptionDemo obj = new NumberFormatExceptionDemo();
		obj.getData();
	}
}
