package chap06.sec08.exam02;

public class ComputerExample {

	public static void main(String[] args) {
		//Computer 객체 생성
	Computer mycom = new Computer();
	
	//sum 메소드 호출 시 1,2,3 을 제공하고 
	//합산 결과를 리턴 받아서 result1 변수 대입
	int result1 = mycom.sum(1,2,3);
	System.out.println("sum = " + result1);
	//sum 메소드 호출 시 1,2,3,4,5 을 제공하고 
		//합산 결과를 리턴 받아서 result2 변수 대입
	int result2 = mycom.sum(1,2,3,4,5);
	System.out.println("sum2 = " + result2);
	//sum 메소드 호출 시 배열 데이터 전체 을 제공하고 
			//합산 결과를 리턴 받아서 result3 변수 대입
	int[] values = {1,2,3,4,5,6,7,8,9,10,11};
	int result3 = mycom.sum(values);
	System.out.println("sum3 = " + result3);
	
	
	//sum 메소드 호출 시 배열 데이터 직접 제공하고 
	//합산 결과를 리턴 받아서 result4 변수 대입
	int result4 = mycom.sum(new int[] {1,2,3,4,5});
	//선언된 sum 메소드에 배열(데이터)를 직접 대입할때는 반드시 타입을 다시 선언
	System.out.println("sum 4 = " + result4);
	
	
	}

	
	
	
}
