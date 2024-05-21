package chap17.sec05;

import java.util.ArrayList;
import java.util.List;

public class FilteringExample {

	public static void main(String[] args) {
		
		//List 컬랙션 생성
		List<String> list = new ArrayList<>();
		list.add("홍길동");
		list.add("참깨스틱");
		list.add("양파링");
		list.add("오징어칩");
		list.add("꼬북칩");
		
		//중복 요소 제거
		list.stream()
			.distinct()
			.forEach(n -> System.out.println(n));
		System.out.println();
		
		//신으로 시작하는 요소만 필터링
		list.stream()
		
			.filter(n -> n.startsWith("홍"))
			.forEach(n -> System.out.println(n));
		System.out.println();
		
		// 중복 요소를 먼저 제거하고, 신으로 시작하는 요소만 필터링
		list.stream()
			.distinct()
			.filter(n -> n.startsWith("홍"))
			.forEach(n -> System.out.println());
		
		//startsWith("문자열") : 주어진 문자열로 시작하면 true 리턴
	}
	
	
}
