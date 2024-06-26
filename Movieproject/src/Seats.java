import java.util.ArrayList;

public class Seats {
	public static final int MAX_ROW =5;
	public static final int MAX_COL =9;
	private String[][] map = new String[MAX_ROW][MAX_COL];
	
	public Seats(ArrayList<Reservation> reservation) throws Exception {
		for(int i=0; i <MAX_ROW; i++) {
			for(int j=0; j < MAX_COL; j++) {
				map[i][j]="a"; // 초기 좌석 상태 설정
			}
		}
		
		for(int i=0; i<reservation.size(); i++) {
			Reservation r = new reservations.get(i);
			String seatName = r.getSeatName();
			mark(seatName);  // 예매 좌석임을 표시
		}
	}
	
	public void show() { // 전체 좌석 예매 현황 출력
		System.out.println("--------------------");
		System.out.println("    S C R E E N     ");
		System.out.println("--------------------");
		for(int i=0; i < MAX_ROW; i++) {
			System.out.printf("%c",'A' + i);
			for(int j=0; j < MAX_COL; j++) {
			System.out.printf("%s", map[i][j]); // 특정 좌석 예매 현황
			}
			System.out.println();
		}
		System.out.println("  1 2 3 4 5 6 7 8 9");
	}
	
	public void mark(String seatName) throws Exception {
		char[] temp = seatName.toCharArray(); // 좌석명을 문자 배열로 변환
		int row = temp[0] - 'A'; //행 인덱스를 계산
		int col = temp[2] - '1'; //열 인덱스를 계산
		if("X".equals(map[row][col])) { // 예매된 좌석인 경우
			throw new Exception("이미 예매된 좌석입니다"); // 예외 발생
	}
		map[row][col] = "X"; //예매되었음을 표시
}
}
