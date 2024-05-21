package chap012.sec03.exam01;

public class Member {
	public String id;
	public Member(String id) {
		this.id = id;
	}
	//Object Class equals 메소드를 재정의
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member target) {
			//obj가 Member 타입인지 검사하고 타입변환 후 target 변수에 대
			if(id.equals(target)) { //id 문자열이 같은지 비교함
				return true;
			}
		}
		return false;
	}
}
