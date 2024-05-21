package chap013.sec02.exam01;

public class Product<K,M> { //타입 파라미터로 K,M 정의
	//필드 K와 M을 필드 타입으로 사용
	private K kind;
	private M model;
	//메소드
	public K getKind() {return this.kind;}
	public M getModel() {return model; }
	
	//타입 파라미터를 리턴 타입으로 변환
	public void setKind(K kind) {this.kind = kind;}
	public void setModel(M model) {this.model = model;}
	
	// 타입 파라미터를 매개 변수 타입으로 사용
	// 타입 파라미터를 사용하는 이유
	

}
