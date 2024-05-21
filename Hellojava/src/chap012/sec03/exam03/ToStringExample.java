package chap012.sec03.exam03;

public class ToStringExample {

	public static void main(String[] args) {
		Smartphone myphone = new Smartphone("삼성전자","안드로이드");
		
		String strObj = myphone.toString(); //메소드 호출
		System.out.println(strObj);
		
		System.out.println(myphone);
		/* 매개값이 개체가 되면 객체의 toString() 메소드를 호출
		 * 해서 리턴값을 호출함
		 */
	}

}
