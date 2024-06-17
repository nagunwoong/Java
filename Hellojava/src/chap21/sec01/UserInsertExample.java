package chap21.sec01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.*;

public class UserInsertExample {

	public static void main(String[] args) {
		
		
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//연결하기
			conn = DriverManager.getConnection(
					"jdbc:mysql://127.0.0.1:3306/thisisjava",
					"root",
					"tiger");
			// SQL 문 작성
			String sql = "" +
			"Insert Into users (userid, username, userpassword, userage, usermaill)" +
			"values (?, ? ,? ,?, ?)";
			
			// PreparedStatement 얻기 및 값 지정
			PreparedStatement  pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "winter");
			pstmt.setString(2, "한겨울");
			pstmt.setString(3, "123555");
			pstmt.setInt(4, 31);
			pstmt.setString(5, "galawer@naver.com");
			
			//Sql문 실행
			int rows = pstmt.executeUpdate();
			System.out.println("저장된 함수 : " + rows );
			
			//PreparedStatement 닫기
			pstmt.close();
		}catch (ClassNotFoundException e) { 
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {}
			}		
		}
	} 

}
