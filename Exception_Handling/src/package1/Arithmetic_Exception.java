package package1;
//Default Exception Handler handles this Exception
public class Arithmetic_Exception {
	void m2() {
		System.out.println("Start m2");
		System.out.println(10 / 0);
		System.out.println("end m2");
	}

	void m1() {
		System.out.println("start m1");
		m2();
		System.out.println("end m1");
	
	}

	public static void main(String[] args) {
		Arithmetic_Exception obj = new Arithmetic_Exception();
		System.out.println("start main");
		obj.m1();
		System.out.println("end main");
	}
}
