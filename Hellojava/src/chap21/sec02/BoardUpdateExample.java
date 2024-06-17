package chap21.sec02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.io.FileInputStream;


public class BoardUpdateExample {

	public static void main(String[] args) {
		
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			// 연결하기
			conn = DriverManager.getConnection(
					"jdbc:mysql://127.0.0.1:3306/thisisjava",
					"root",
					"tiger");
		// 매개변수화된 SQL 문 작성
		//StringBuilder 는 변경 간으한 문자열을 만들어 줌
		String sql = new StringBuilder()
				.append("UPDATE boards SET ")
				.append("bittle = ?, ")
				.append("bcontent = ?, ")
				.append("bfilename = ?, ")
				.append("bfiledate = ? ")
				.append("WHERE bno = ?")
				.toString();
		
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, "눈사람");
		pstmt.setString(2, "눈으로 만든 사람");
		pstmt.setString(3, "snowgirl.jpg");
		pstmt.setBlob(4, new FileInputStream("src/chap21/sec02/snowgirl.jpg"));
		pstmt.setInt(5, 1);
		
		int rows = pstmt.executeUpdate();
		System.out.println("수정된 행 수 : " + rows);
		
		pstmt.close();
		
	}catch(Exception e) {
		e.printStackTrace();
	}finally {
		if(conn != null) {
			try {
				conn.close();
			}catch(SQLException e) {}
		}
		}
}
}
