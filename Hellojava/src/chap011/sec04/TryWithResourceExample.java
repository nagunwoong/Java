package chap011.sec04;

public class TryWithResourceExample {

	public static void main(String[] args) {
		try(MyResource res = new MyResource("A" )) {
			String data = res.read1();
			int value = Integer.parseInt(data);
		}catch(Exception e) {
			System.out.println("예외 처리 : " + e.getMessage());
		}
		System.out.println();
		
		try(MyResource res = new MyResource("A" )) {
			String data = res.read2();
			int value = Integer.parseInt(data);
			//NumberFormatException 발생
		} catch (Exception e) {
			System.out.println("예외 처리 : " + e.getMessage());
		}
		System.out.println();
		
		MyResource res1 = new MyResource("A");
		MyResource res2 = new MyResource("B");
		try(res1; res2){ //외부 리소스 변수를 사용함
			String data1 = res1.read1();
			String data2 = res2.read1();
		}catch(Exception e) {
			System.out.println("예외 처리 : " + e.getMessage());
		}
		
	}

}
