package chap17.sec01.exam01;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class StreamExample {

	public static void main(String[] args) {
		
		//Set 컬랙션 생성
		Set<String> set = new HashSet<>();
		set.add("홍길동");
		set.add("나건웅");
		set.add("새우깡");
		
		//Stream 을 이용한 요소 반복 처리
		Stream<String> stream = set.stream(); //스트림 얻기
		stream.forEach(name -> System.out.println(name));
		
	}

}
