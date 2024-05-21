package chap06.sec08.exam01;

public class CalculatorExample {

	public static void main(String[] args) {
		//Calculator 객체 생성
		Calculator mycalc = new Calculator();
		
		mycalc.Poweron();
		int result = mycalc.plus(50, 60);
		System.out.println("result = " + result);
		
		double result2 = mycalc.divide(10, 4);
		System.out.println("result2 = " + result2);
		
		mycalc.Poweroff();
		
	}

}
