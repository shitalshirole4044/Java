package package2;

public class FinallyDemo {
	void m1() {
		
	}
	void m2() {
		
	}
	public static void main(String[] args) {
		FinallyDemo obj=new FinallyDemo();
		obj.m1();
		obj=null;
		try {
			obj.m2();
		}catch(NullPointerException e) {
			System.out.println("NullPointerExceptionDemo");
		}finally {
			System.out.println("connection closed");
		}
		System.out.println("end main");
	}
}
