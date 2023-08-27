package package1;

public class NullPointerExceptionDemo {
	void m1() {
		System.out.println("In m1");
		
	}
	void m2() {
		System.out.println("in m2");
	}
	public static void main(String[] args) {
		System.out.println("start main");
		NullPointerExceptionDemo obj=new NullPointerExceptionDemo();
		obj.m1();
		obj=null;
		obj.m2();
		System.out.println("end main");
	}
}
