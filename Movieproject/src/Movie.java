import java.io.*;
import java.time.Instant;
import java.util.*;

public class Movie {
	private long id;
	private String title;
	private String genre;
	private static final File file=new File("movies.txt");
	
	public Movie(long id, String title, String genre) {
		this.id=id;
		this.title=title;
		this.genre=genre;
	}
	
	public static ArrayList<Movie> findAll() throws IOException{
		ArrayList<Movie> movies=new ArrayList<>();
		BufferedReader br=new BufferedReader(new FileReader(file));
		String line=null;
		
		while((line=br.readLine())!=null) {	//파일을 한 행씩 읽어와 반복
			String[] temp=line.split(",");	//쉼표를 기준으로 문자열을 나눔
			Movie m=new Movie(
					Long.parseLong(temp[0]),	//영화 대푯값
					temp[1],	//영화 제목
					temp[2]		//영화 장르
					);
			
			movies.add(m);	//생성 영화 객체를 ArrayList에 추가
		}

		br.close();
		return movies;
	}
	
	public String toString() {
		return String.format("[%d] : %s(%s)", id,title,genre);
	}
	
	public Movie(String title, String genre) {
		this.id = Instant.now().getEpochSecond(); //타임스탬프
		this.title = title;
		this.genre = genre;
	}
	
	public void save() throws IOException {
		FileWriter fw = new FileWriter(file, true); //이어쓰기 모드 설정
		fw.write(this.toFileString() + "\n");
		fw.close();
	}
	
	private String toFileString() {
		return String.format("%d,%s,%s", id, title, genre);
	}
	
	public static void delete(String movieIdStr) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(file));
		String text = "";	// 파일 복사를 위한 빈 문자열
		String line = null;
		
		while((line = br.readLine()) != null) {
			String[] temp = line.split(",");	//쉼표 기준으로 문자열을 나눔
			if(movieIdStr.equals(temp[0])) {	// 삭제 대상값을 찾으면
				continue;
			}
			
			text += line + "\n";
		}
		br.close();
		
		FileWriter fw = new FileWriter(file);
		fw.write(text); //파일 출력
		fw.close();
	}
	
	public static Movie findById(String movieIdStr) throws IOException {
		Movie movie = null;
		BufferedReader br = new BufferedReader(new FileReader(file));
		String line = null;
		
		while((line = br.readLine()) != null) {
			String[] temp = line.split(",");
			if(movieIdStr.equals(temp[0])) {
				movie = new Movie(Long.parseLong(temp[0]),temp[1],temp[2]);
				break;
			}
		}
		
		br.close();
		return movie;
	}
	
	public String getTitle() {
		return title;
	}
	
}
