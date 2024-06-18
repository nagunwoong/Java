package chap21.sec06;


import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

public class BoardExample1 {
	// 필드
	private Scanner scanner = new Scanner(System.in);
	private Connection conn;

	// 생성자
	public BoardExample1() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://127.0.0.1:3306/thisisjava";
			conn = DriverManager.getConnection(url, "root", "tiger");
		}catch(Exception e) {
			e.printStackTrace();
			exit();
		}
	}
	// 메소드
	public void list() {
        System.out.println();
        System.out.println("게시물 목록");
        System.out.println("----------------");
        System.out.printf("%-6s%-12s%-16s%-40s\n", "no", "writer", "date", "title");
        System.out.println("-------------------------------------------");
        System.out.printf("%-6s%-12s%-16s%-40s\n", "1", "writer", "2024.06.17", "게시판에 오신걸 환영합니다");
        System.out.printf("%-6s%-12s%-16s%-40s\n", "21", "writer", "2024.06.17", "게시판에 오신걸 환영합니다");
        
        // boards 테이블에서 게시물 정보를 가져와서 출력
        
        
        
        
        
        

        mainMenu();
    }
    
    public void mainMenu() {
        System.out.println();
        System.out.println("------------------------");
        System.out.println("메인메뉴 : 1.create    2.Read    3.Clear    4.Exit");
        System.out.print("메뉴 선택 : ");
        System.out.println();
        String menuNo = scanner.nextLine();
        
        switch(menuNo) {
        case "1" -> create();
        case "2" -> read();
        case "3" -> clear();
        case "4" -> exit();
        }
        
        
        
    }
    
    public void create() {
    	System.out.println();
    	list();
    }
   	public void read() {
        	System.out.println();
        	list();
   	}
   	public void clear() {
            	System.out.println();
            	list();
   	}
   	public void exit() {
               System.exit(0);

                	
    }
	
	
	public static void main(String[] args) {
		
		  BoardExample1 boardExample = new BoardExample1();
	        boardExample.list();
		
	}

}
