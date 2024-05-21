package chap17.sec12examl02;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import chap17.sec12examl01.Student;

public class CollectExample {

	public static void main(String[] args) {
		
		List<Student> totalList = new ArrayList<>();
		totalList.add(new Student("홍길동", "남", 92));
		totalList.add(new Student("나건웅", "남", 87));
		totalList.add(new Student("서가을", "여", 54));
		totalList.add(new Student("김태립", "남", 34));
		
		Map<String, List<Student>> map = totalList.stream()
				.collect(Collectors.groupingBy(s -> s.getSex()));
		
		List<Student> maleList = map.get("남");
		maleList.stream().forEach(s -> System.out.println(s.getName()));
		System.out.println();
		
		List<Student> femaleList = map.get("여");
		femaleList.stream().forEach(s -> System.out.println(s.getName()));
	}	

}	
