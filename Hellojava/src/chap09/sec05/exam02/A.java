package chap09.sec05.exam02;

public class A {
	//A 인스턴스 필드 선언
	String field = "A-field";
	//A 인스턴스 메소드 선언
	void method() {
		System.out.println("A-field");
	}
		//B 인스턴스 매소드 선언
		class B {
			
		String field = "B-field";
		
		void method() {
			System.out.println("B-method");
		}
		//B 인스턴스 메소드
		void print() {
			//B객체의 필드와 메소드 사용
			System.out.println(this.field);
			//this : 해당 중첩 클래스의 객체를 의미함
			this.method();
			
			//A 객체의 필드와 메소드 사용
			System.out.println(A.this.field);
			/*중첩 클래스 내부에서 바깥 클래스 객체를 얻으려면
			 * 바깥 클래스이름에 this 를 붙어
			 */
		A.this.method();
		}
	}
	
		
		//A의 인스턴스 메소드
		void useB() {
			B b = new B();
			b.print();
		}

}