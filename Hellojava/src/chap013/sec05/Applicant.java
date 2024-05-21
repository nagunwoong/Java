package chap013.sec05;

public class Applicant<T> {
	public T kind; //필드 선언
	
	public Applicant(T kind) {
		this.kind = kind;
	}
	
}
