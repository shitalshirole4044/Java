package package2;
import java.io.*;
public class TryWithMultipleCatch {
	
	public static void main(String[] args) throws Exception{
		int data=4;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try {
			data=Integer.parseInt(br.readLine());
			System.out.println(10/data);
		}catch(NumberFormatException e) {
			System.out.println("catch by Number format Exception");
		}catch(IllegalArgumentException ae) {
			System.out.println("catch by illegal Argument Exception");
		}catch(Exception E) {
			System.out.println("catch by Exception class");
		}
		System.out.println("end main");
	}

}
