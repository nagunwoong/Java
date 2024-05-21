package chap09.sec02.exam01;

public class AExample {

	public static void main(String[] args) {
		// A 객체 생성
		A a = new A();
		
		
		//B 객체 생성
		A.B b = a.new B();
		/* B 객체를 A클래스 외부에 생성할때
		 * A 객체를 먼저 생성한 후 B 객체를 생성함.
		 */
	}

}
