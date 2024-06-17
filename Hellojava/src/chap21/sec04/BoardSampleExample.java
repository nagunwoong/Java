package chap21.sec04;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class BoardSampleExample {

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
			String sql = "" +
					"SELECT bno, btitle, bcontent, bwriter, bdate, bfilename, bfiledate " +
					"FROM boards " +
					"WHERE bwriter=?";
			
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "summer");
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				Board board = new Board();
				board.setBno(rs.getInt("bno"));
				board.setBtitle(rs.getString("btitle"));
				board.setBcontent(rs.getString("bcontent"));
				board.setBwriter(rs.getString("bwriter"));
				board.setBdate(rs.getDate("bdata"));
				board.setBfilename(rs.getString("Bittle"));
				board.setBfiledate(rs.getBlob("bfiledate"));
				
			
				
				System.out.println(board);	//콘솔에 출력
				
				//파일로 저장
				Blob blob = board.getBfiledate();
				if(blob != null) {
					InputStream is = blob.getBinaryStream();
					OutputStream os = new FileOutputStream("/Users/gaebal/eclipse-workspace" + board.getBfilename());
					is.transferTo(os);
					os.flush();
					os.close();
					is.close();
				}
				
			}
			pstmt.close();
		
	} catch(Exception e) {
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
