package chap15.sec03.exam02;

public class Member {
	public String name;
	public int age;
	
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// hashCode 재정의
	@Override
	public int hashCode() {
		return name.hashCode() + age;

	// Name 과 age 값이 같으면 동일한 hashCode 가 리턴됨
		
		} 
	
	
	//equals 재정의
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member target) {
			return target.name.equals(name) && (target.age == age);
			// name 과 age 값이 같ㅊ으면 true 를 리턴함
		}else {
			return false; //name 과 age 값이 다르면 false를 리턴함 
		}
	}
}
