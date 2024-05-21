package chap14.sec04;

public class ThreadNameExample {

	public static void main(String[] args) {
		
		Thread mainTread =Thread.currentThread();
		System.out.println(mainTread.getName() + "실행");
		
		for(int i=0; i<3; i++);
		Thread threadA = new Thread() {
			@Override
			public void run() {
				System.out.println(getName() + "실행");
			}
		};
		threadA.start(); //생성된 작업 스레드의 run() 메소드를 실행
	}
	
	Thread chatThread = new Thread() {
		@Override
		public void run() {
			System.out.println(getName() + "실행");
	}

};

	
}
