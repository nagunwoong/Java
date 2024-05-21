package chap05.sec05;

public class EqualsExample {

	public static void main(String[] args) {
		String strvar1 = "홍길동";
		String strvar2 = "홍길동";
		
	if(strvar1 == strvar2) {
		System.out.println("strvar1과 strval2는 창조가 같음");
	
	}else {
		System.out.println("strvar1과 strval2는 창조가 다");
	}
		
	if(strvar1.equals(strvar2)) {
		System.out.println("strvar1과 strval2는 문자열 같음");
	}
	
	String strvar3 = new String("홍길동");
	String strvar4 = new String("홍길동");
	
	
	if(strvar3 == strvar4) {
		System.out.println("strvar3과 strval4는 창조가 같음");
	
	}else {
		System.out.println("strvar3과 strval4는 창조가 다름");
	}
	
	}

}
