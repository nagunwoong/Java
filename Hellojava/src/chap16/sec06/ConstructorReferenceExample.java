package chap16.sec06;

public class ConstructorReferenceExample {

	public static void main(String[] args) {
		
		Person person = new Person();
		
		Member m1 = person.getMember1(Member::new); //생성자 참조
		System.out.println(m1);
		System.out.println();
		
		
		Member m2 = person.getMember2(Member::new); //생성자 참조
		System.out.println(m2);
		
	// 함수형 인터페이스 매개변수 개수에 따라 실행되는 member 생성자가 다름	
	
		}
	
	/* 생성자ㅣ 참조
	 * 객체를 생성하는 것. 람다식이 객체를 생성하고 리턴하도록 구성되면
	 * 람다식을 생성자 참조로 대치 가능
	 * (a,b) -> {return new 클래스 이름(a,b):} 객체를 생성한 후 리턴만 함
	 * 클래스 이름 뒤에 :: 기호를 붙히고 new 연산자를 기술
	 * (클래스 이름::new)
	 */
	
	
}


 