package chap09.sec02.exam01;

public class A {
	//인스턴스 맴버 클래스
	class B {}
	
	//인스스 필드값으로 B객체 대입
	B field = new B();
	
	//생성자
	A() {
		B b = new B();
		
	}
	
	//인스턴스 메소드
	void method() {
		B b = new B();
	}
	/*인스턴스 맴버 클래스 B객체는 인스턴스 필드값, 생성자,인스턴스 메소드에서 
	 * 생성할수 있음
	 */
}
