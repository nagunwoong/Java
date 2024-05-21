package chap05.sec04;

public class GaarbageObjectExample {

	public static void main(String[] args) {
		String hobby = "여행";
		
		
		System.out.println(hobby);
		hobby = null; //"여행"에 해당하는 string 객체를 쓰레기로 만듬.
		System.out.println(hobby);
		
		
		String kind1 = "자동차";
		String kind2 = kind1;
		System.out.println(kind1);
		System.out.println(kind2);
		kind1 = null; 
		System.out.println(kind1);
		System.out.println(kind2);
		
	}

}
