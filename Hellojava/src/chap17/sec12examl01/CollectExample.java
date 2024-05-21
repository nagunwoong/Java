package chap17.sec12examl01;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectExample {

	public static void main(String[] args) {
		
		List<Student> totalList = new ArrayList<>();
		totalList.add(new Student("홍길동", "남", 92));
		totalList.add(new Student("나건웅", "남", 87));
		totalList.add(new Student("김민수", "남", 75));
		totalList.add(new Student("미길순", "여", 64));
		
		//남학생만 묶어 List 생성
		List<Student> maleList1 = totalList.stream()
						.filter(s -> s.getSex().equals("남"))
						.collect(Collectors.toList());	
		// Student 스트림에서 남학생만 필터링해서 별도의 List로 생성함
		// Stream collect 메소드는 필터링 또는 
		//매핑된 요소들을 새로운 컬랙션에 수집하고, 이 컬렉션을 리턴
		
		maleList1.stream()
			.forEach(s -> System.out.println(s.getName()));
		
		// 여학생만 묶어 List 생성
		List<Student> maleList2 = totalList.stream()
				.filter(s -> s.getSex().equals("여"))
				.collect(Collectors.toList());	
		// 요소 스트림에서 tolist() 매소드를 사용해서 list 컬랙션을 얻음
		
		maleList2.stream()
		.forEach(s -> System.out.println(s.getName()));
		
		System.out.println();
		
		// 학생 이름을 키, 학생의 점수를 값으로 갖는 MAP 생성
		Map<String, Integer> map = totalList.stream()
				.collect(Collectors.toMap(s -> s.getName(), 
											s -> s.getScore()
											)
						);
				
				System.out.println(map);
			
				
	}

}
