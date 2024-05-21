package chap15.sec02.exam03;

import java.util.ArrayList;
import java.util.List;

public class LinkedListExample {

	public static void main(String[] args) {
		// LinkedList 객체 생성
		List<String> list1 = new ArrayList<>();
		
		// LinkedList 객체 생성
		List<String> list2 = new ArrayList<>();
		
		//변수 선언
		long startTime; //시작 시간
		long endTime; // 종료 시간
		
		//ArrayhList 객체 저장하는 시간 측정
		startTime = System.nanoTime();
		for(int i=0; i<10000; i++) {
			list1.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.printf("%~17s %8d ns \n", "ArrayList 걸린 시간");
	}

}
