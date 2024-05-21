package chap013.sec03.exam01;

public class GenericExample {
	//제너릭 메소드인 boxing 을 선언
	public static <T> Box<T> boxing(T t) { //타입 파라미터 T정의
		Box<T> box = new Box<T>();
		box.set(t);
		return box;
		
	}
	
	public static void main(String[] args) {
		// 제네릭 메소드 호출
		Box<Integer> box1 = boxing(100);
		//T를 Integer 로 대체함
		int intvalue = box1.get();
		System.out.println(intvalue);
		
		// 제네릭 메소드 호출2
		Box<String> box2 = boxing("나건웅");
		// T를 String 으로 대체함
		
		String strValue = box2.get();
		System.out.println(strValue);
	
	}

}
