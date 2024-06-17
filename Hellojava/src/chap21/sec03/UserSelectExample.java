package chap21.sec03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserSelectExample {

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
			String sql = "SELECT userid, username, userpassword, userage, usermaill " +
		             "FROM users " +
		             "WHERE userid=?";


			
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "summer");
			
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				User user = new User();
				user.setUserId(rs.getString("userid"));
				user.setUserName(rs.getString("username"));
				user.setUserPassword(rs.getString("userpassword"));
				user.setUserAge(rs.getInt("userage"));
				user.setUserMaill(rs.getString("usermaill"));

				System.out.println(user);
						
			}else {
				System.out.println("아이디가 없습니다");
			}
			rs.close();
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
