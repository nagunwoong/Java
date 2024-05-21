package chap15.sec03.exam01;

import java.util.HashSet;
import java.util.Set;

public class HashSerExample {

	public static void main(String[] args) {
		
		// Set 컬랙션은 저장 순서가 유지되지 않음
		// Set 컬랙션은 중복 저장할수 없음
		// HashSet 컬랙션 생성
		Set<String> set = new HashSet<>();
		
		//객체 저장 : add()
		set.add("Java");
		set.add("BTS");
		set.add("Black Pink");
		set.add("GirlFriend");
		set.add("Monster");
		set.add("Java"); // 중복 객체는 저장 안됨
		
		//저장된 객체수 출력
		
			
		
	}

}
