package chap17.sec12examl03;

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
		
		Map<String, Double> map = totalList.stream()
				.collect(Collectors.groupingBy(s -> s.getSex(),
										Collectors.averagingDouble(s -> s.getScore())));
		// 학생들을 성별로 그룹핑하고 각각의 평균 점수를 구해서 map 으로 얻는 코드
		
		System.out.println(map);
		
		}

}
