package chap06.sec06.Exam02;

public class CarExample02 {

	public static void main(String[] args) {
		//car 객체 생성
		car mycar = new car();
		//car 객체의 필드값 읽기
		System.out.println("제작 회사 : " + mycar.company);
		System.out.println("모델명 : " + mycar.model);
		System.out.println("색상 : " + mycar.color);
		System.out.println("최고속도 : " + mycar.maxspeed);
		System.out.println("최저 속도 : " + mycar.speed);
		
		//Car 객체의 필드값 변경
		mycar.speed = 60;
		mycar.color = "노랑";
		System.out.println("수정 속도 : " +mycar.speed);
		System.out.println("수정된 색상 : " + mycar.color);
		
	}

}
