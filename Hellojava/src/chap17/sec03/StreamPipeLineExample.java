package chap17.sec03;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class StreamPipeLineExample {

	public static void main(String[] args) {
		
		List<Student> list = Arrays.asList(
				new Student("나건웅", 10),
				new Student("김민수", 30),
				new Student("백승곤", 20)
				);
				
		// 방법1
		/*
		 Stream<student> studentStream = list.stream();
		 //중간 처리(학생 객체를 점수로 매김)
		 IntStream scoreStream = studentStream.mapToInt(student -> student.getScore());
		 //최종처리 (평균 점수)
		 double avg = scoreStream.average().getAsDouble();
		 */
		
		// 방법2
		double avg = list.stream()
				.mapToInt(student -> student.getScore())
				.average()
				.getAsDouble();
		
		System.out.println("평균 점수 : " + avg);
	}

}
