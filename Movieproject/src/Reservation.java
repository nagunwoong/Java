import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Reservation {
	
	private long id;
	private long movieId;
	private String movieTitle;
	private String seatName;
	private static final File file = new File("reservations.txt");
	
	public Reservation(long id, long movieId, String movieTitle, String seatName) {
		
		this.id = id;
		this.movieId = movieId;
		this.movieTitle = movieTitle;
		this.seatName = seatName;
	}
	
	public static Reservation findById(String reservationId) throws IOException {
		Reservation r = null;
		BufferedReader br = new BufferedReader(new FileReader(file));
		String line = null;
		
		while((line = br.readLine()) != null) { //행단위 문자열 읽기
			String[] temp = line.split(","); //문자열을 쉼표로 나눔
			if(reservationId.equals(temp[0])) { // 발급번호를 찾으면
				r = new Reservation(
						Long.parseLong(temp[0]), //발급번호
						Long.parseLong(temp[1]), //영화 대표값
						temp[2],	//영화 제목
						temp[3]		//좌석명
						);
					break;
			}
		}
		
		br.close();
		return r;
	}
	
	public String toString() {
		return String.format("영화 : %s, 좌석 : %s, ", movieTitle, seatName);
	}
	
	public static Reservation canceled(String reservationId) throws IOException {
		Reservation canceled = null;
		BufferedReader br = new BufferedReader(new FileReader(file));
		String text = "";
		String line = "";
		
		while((line = br.readLine())  != null) { //행 단위 문자열 읽기
			String[] temp = line.split(",");
			if(reservationId.equals(temp[0])) { // 발급번호를 찾으면
				canceled = new Reservation (
						Long.parseLong(temp[0]),
						Long.parseLong(temp[1]),
						temp[2],
						temp[3]);
					continue; //  다음 반복으로 넘어감
			}
			text += line + "\n"; //읽은 문자열 누적하여 복사
		}	
		br.close();
		
		FileWriter fw = new FileWriter(file);
		fw.write(text); //파일 출력
		fw.close();
		return canceled; // 삭제된 예매를 객체로 변환
	}	
		
	public static ArrayList <Reservation> findByMovieId(String movieIdStr) throws IOException {
		ArrayList<Reservation> reservations = new ArrayList<Reservation>();
		BufferedReader br = (new BufferedReader(file));
		String line = null;
		
		while((line = br.readLine()) != null) {
			String[] temp = line.split(",");
			if(movieIdStr.equals(temp[1])) { //영화의 대표값을 찾았다면
				long id = Long.parseLong(temp[0]);	//예매 발급번호
				long movieId = Long.parseLong(temp[1]);	//예매 영화의 대표값
				String movieTitle = temp[2];	// 예매영화의 제목
				String seatName = temp[3]; // 예매 영화의 좌석명
				
				Reservation r = new Reservation(id,movieId, movieTitle, seatName);
				reservations.add(r); // 생성 객체를 ArrayList에 추가
				
			}
		}
		br.close();
		return reservations; //예매 객체를 담은 ArrayList 반환
		
		}
		
		public Reservation(long movieId, String movieTitle, String seatName) {
			this.id = Instart.now().toEpochMilli();
			this.movieId = movieId;
			this.movieTitle = movieTitle;
			this.seatName = seatName;
		
		}
		
		public String getSeatName() {
			return seatName;
		}
		
		public void save() throws IOException {
			FileWriter fw = new FileWriter(file, true);
			fw.write(this.toFileString() + "\n");
			fw.close();
		}
		
		private String toFileString() {
			return String.format("%d,%d,%s,%s", id, movieId, movieTitle, seatName);
		}
		
		public long getId() {
			return id;
		}
		
	}
	

