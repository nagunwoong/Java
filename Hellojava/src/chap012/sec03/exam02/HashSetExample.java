package chap012.sec03.exam02;

import java.util.HashSet;

public class HashSetExample {

	public static void main(String[] args) {
		HashSet hashSet = new HashSet();
		
		
		Student s1 = new Student(1, "홍길동");
		hashSet.add(s1); //HashSet 에 Student 객체를 저장함
		System.out.println("저장된 객체수  : " + hashSet.size());
		
		Student s2 = new Student(1, "홍길동");
		hashSet.add(s2);
		//동등 객체는 중독 저장 하지 않음
		System.out.println("저장된 객체수  : " + hashSet.size());
		
		Student s3 = new Student(2, "홍길동");
		hashSet.add(s3);
		System.out.println("저장된 객체수  : " + hashSet.size());
		
				
			
		
	}

}
