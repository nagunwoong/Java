package chap17.sec06.exam02;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MapExample {
	
	public static void main(String[] args) {
	

	 int[] intArray = {1,2,3,4,5};
	 
	 IntStream intStream = Arrays.stream(intArray);
	 intStream
	 		.asDoubleStream()
	 		.forEach(d -> System.out.println());
	 System.out.println();
	 
	 intStream = Arrays.stream(intArray);
	 intStream
	 		.boxed() //int ==> Integer (래퍼 객체 요소, 박싱)
	 		.forEach(d -> System.out.println(d));
	 
	 	
	}
}
