package chap06.sec10.exam02;

public class Television {
	static String company = "mycompany";
	static String model = "samsung";
	static String info;
	
	//정적 블록 : 복작한 초기화 과정이 필요하다면 정적 블록을 이용
	static {
		info = company + "-" + model;
	}
	
}
