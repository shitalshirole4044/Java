package package2;

public class ArithmeticExceptionDemoBytryCatch {
	
	public static void main(String[] args) {
		System.out.println("Start main");
		try {
			System.out.println(10/0);
		}catch(ArithmeticException e) {
			System.out.println("in catch");
		}
		System.out.println("end main");
	}
}
