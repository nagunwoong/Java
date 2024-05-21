package chap06.sec06.Exam01;

public class carExample {

	public static void main(String[] args) {
	car mycar = new car(); //Car 객체 생성
	
	
//car 객체의 필드값 읽기
	System.out.println("모델명 : " +mycar.modle);
	System.out.println("시동여부 : " +mycar.start);
	System.out.println("속도 : " +mycar.speed);
		
	}

}
