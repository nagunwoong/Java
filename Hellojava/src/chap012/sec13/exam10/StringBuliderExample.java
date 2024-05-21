package chap012.sec13.exam10;

public class StringBuliderExample {

	public static void main(String[] args) {
		String str = "";
		StringBuilder sb = new StringBuilder();
		for(int i=1; i<=100; i++) {
			sb.append(i); //StringBuilder 객체의 i값 추가
			
		}
		str = sb.toString();
		System.out.println(str);
	}
	
	
	
}
