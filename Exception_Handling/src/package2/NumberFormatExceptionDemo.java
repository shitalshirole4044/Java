package package2;

import java.io.*;

public class NumberFormatExceptionDemo {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		System.out.println(str);
		int data=0;
		try {
		data = Integer.parseInt(br.readLine());
		}catch(NumberFormatException e) {
			//System.out.println(e.getMessage());
			//System.out.println(e.toString());
			//e.printStackTrace();
			System.out.println("plz enter Integer data");
			data=Integer.parseInt(br.readLine());
		}
		System.out.println(data);

	}
}
