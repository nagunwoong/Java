package chap013.sec05;

public class Course {

	public static void registerCourse1(Applicant<?> applicant) {
		System.out.println(applicant.kind.getClass().getSimpleName() + 
				"이(가) Course1 을 등록함");
	}
	// 학생만 등록가능
	public static void registerCourse2(Applicant<? extends Student> applicant) {
		System.out.println(applicant.kind.getClass().getSimpleName() + 
				"이(가) Course2 을 등록함");
	
	}
	//학생만 등록가능
	
	public static void registerCourse3(Applicant<? extends Student> applicant) {
		System.out.println(applicant.kind.getClass().getSimpleName() + 
				"이(가) Course3 을 등록함");
}
}