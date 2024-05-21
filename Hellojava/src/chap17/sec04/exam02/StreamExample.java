package chap17.sec04.exam02;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample {

	public static void main(String[] args) {
		
		// 문자열과 배열과 정수 배열로 부터 스트림을 얻는 방법
		String[] strArray = {"나건웅", "동동진", "서가을"};
		Stream<String> strStream = Arrays.stream(strArray);
		strStream.forEach(item -> System.out.print(item + ","));
		System.out.println();
		
		
		int[] intArray = {1, 2, 3, 4, 5 };
		IntStream intStream = Arrays.stream(intArray);
		intStream.forEach(item -> System.out.print(item + ","));
		System.out.println();
		

		
			
		}
	
}
	
	
	
