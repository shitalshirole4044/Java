package package2;

public class InterruptedExceptionDemo {
	public static void main(String[] args) {
		for(int i=0;i<10;i++) {
			System.out.println("i loop");
			try {
			Thread.sleep(5000);
			}catch(InterruptedException e) {
				System.out.println("Interrupted Exception");
			}catch(RuntimeException re) {
				System.out.println("Runtime");
			}
		}
	}
}
