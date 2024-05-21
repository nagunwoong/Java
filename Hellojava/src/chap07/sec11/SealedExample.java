package chap07.sec11;

public class SealedExample {

	public static void main(String[] args) {
		Person p = new Person();
		p.work();
		
		Employee e = new Employee();
		e.work();
		
		Manager m = new Manager();
		m.work();
		
		Director d = new Director();
		d.work();
		
	}

}
