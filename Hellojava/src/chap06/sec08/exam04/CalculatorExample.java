package chap06.sec08.exam04;

public class CalculatorExample {

	public static void main(String[] args) {
		//객체 생성
		Calculator mycalcu = new Calculator();
		//정사각형 넓이 구하기
		double result1 = mycalcu.areaRectangle(10);
		//직사각형 넓이 구하기
		double result2 = mycalcu.areaRectangle(10, 20);
		
		System.out.println("정사각형 넓이 = " + result1);
	}

}
