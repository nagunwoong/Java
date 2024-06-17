package chap21.sec01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionExample {

	public static void main(String[] args) {
		
		Connection conn = null;
		try {
			//JDBC 드라이버 연결
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//연결하기
			conn = DriverManager.getConnection(
					"jdbc:mysql://127.0.0.1:3306/thisisjava",
					"root",
					"tiger");
					System.out.println("연결성공");
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			if (conn != null) {
				try {
					// 연결공지
					conn.close();
					System.out.println("연결 끊기 성공");
				}catch(SQLException e) {}
			}
		}
		
	}

}
