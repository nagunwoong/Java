package chap011.sec04;

public class MyResource implements AutoCloseable{
	private String name;
	
	public MyResource(String name) {
		this.name = name;
		System.out.println("[MyResource(" + name + "열기)");
	}
	
	public String read1() {
		System.out.println("[MyResource(" + name + "읽기)");
		return "100";
	}
	
	public String read2() {
		System.out.println("[MyResource(" + name + "읽기)");
		return "abc";
	
}
	@Override
	public void close() throws Exception {
		System.out.println("[MyResource(" + name + ") 닫기]");
		/* try 블록에서 예외 발생 여부와 상관없이 안전하게 close
		 * close() 메소드가 자동 실행되도록 재정의
		 */
	}
	
}
