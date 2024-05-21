package chap17.sec02;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ParallelStreamExample {

	public static void main(String[] args) {
		
		//List 컬랙션 생성
		List<String> list = new ArrayList<>();
		list.add("나건웅");
		list.add("동동진");
		list.add("감자깡");
		list.add("새우깡");
		list.add("깡깡깡");
		
		//병렬처리
		Stream<String> parallelStream = list.parallelStream();
		// 병렬 스트림 얻기
		parallelStream.forEach(name -> {
			System.out.println(name + " : " + Thread.currentThread().getName());
											//어떤 스레드가 처리하는지 출력
		});
		
	}

}
