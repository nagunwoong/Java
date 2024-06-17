package chap21.sec01;

import java.sql.PreparedStatement;
import java.io.FileInputStream;
import java.sql.*;
import java.sql.PreparedStatement;

public class BoardInsertExample {

	public static void main(String[] args) {
		
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			// 연결하기
			conn = DriverManager.getConnection(
					"jdbc:mysql://127.0.0.1:3306/thisisjava",
					"root",
					"tiger");
			// SQL 문 작성하기
			String sql = "" +
					"Insert Into boards (btitle, bcontent, bwriter, bdate, bfilename, bfiledate)" +
					"values (?, ? ,? ,now(), ?, ?)";
			
			PreparedStatement  pstmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			pstmt.setString(1, "눈오는날");
			pstmt.setString(2, "한겨울");
			pstmt.setString(3, "winter");
			pstmt.setString(4, "snow.jpg");
			pstmt.setBlob(5, new FileInputStream("src/chap21/sec01/snow.jpg"));
			
			// SQL문 실행
			int rows = pstmt.executeUpdate();
			System.out.println("저자오딘 함수 : " + rows);
			
			//bno 값 얻기
			if(rows == 1) {
				ResultSet rs = pstmt.getGeneratedKeys();
				if(rs.next()) {
					int bno = rs.getInt(1);
					System.out.println("저장된 bno : " + bno);
				}
				rs.close();
			}
			pstmt.close();
			
		}	catch(Exception e) {
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
