package chap21.sec03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BoardDeleteExample {

	public static void main(String[] args) {
		
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			// 연결하기
			conn = DriverManager.getConnection(
					"jdbc:mysql://127.0.0.1:3306/thisisjava",
					"root",
					"tiger");
			
			//SQL
			String sql = "Delete From boards WHERE bwriter=?";
			
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "winter");
			
			int rows = pstmt.executeUpdate();
			System.out.println("삭제된 행 수 : " + rows);
			
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
