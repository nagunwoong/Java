package chap09.sec05.exam01;

public class A {
	// A 클래스의 인스턴스 필드와 메소드를 선언
	int field;
	void method1() {}
	// A 클래스의 정적 필드와 정적 메소드를 선언
	static int field2;
	static void method2() {}
		//인스턴스 멤버 클래스 선언
		class B {
			void method() {
				//A 클래스의 인스턴스 필드와 메소드 사용
				field = 10;
				method1();
				
				// A 클래스의 정적 필드와 정적 메소드를 사용
				field2 = 20;
				method2();
				
			}
		}
		//정적 멤버 클래스 선언
		static class C {
			void method() {
				//A 클래스의 인스턴스 필드와 메소드 사용
				//field1 =10; //X
				//method1(); //X
				
				// A 클래스의 정적 필드와 정적 메소드를 사용
				//field1 =20; //X
				//method2(); //X
		/* 정적 멤버 클래스 C는 바깥 객체 A가 없어도 사용 가능해야
		 * 바깥 클래스의 인스턴스 필드와 인스턴스 메소드는 사용하지 않음
		 */
			}
		}
}
