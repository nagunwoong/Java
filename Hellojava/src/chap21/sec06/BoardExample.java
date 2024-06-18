package chap21.sec06;

public class BoardExample {
    // 메소드
    public void list() {
        System.out.println();
        System.out.println("게시물 목록");
        System.out.println("----------------");
        System.out.printf("%-6s%-12s%-16s%-40s\n", "no", "writer", "date", "title");
        System.out.println("-------------------------------------------");
        System.out.printf("%-6s%-12s%-16s%-40s\n", "1", "writer", "2024.06.17", "게시판에 오신걸 환영합니다");
        System.out.printf("%-6s%-12s%-16s%-40s\n", "21", "writer", "2024.06.17", "게시판에 오신걸 환영합니다");
    
        mainMenu();
    }
    
    public void mainMenu() {
        System.out.println();
        System.out.println("------------------------");
        System.out.println("메인메뉴 : 1.create    2.Read    3.Clear    4.Exit");
        System.out.print("메뉴 선택 : ");
        System.out.println();
        
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
        BoardExample boardExample = new BoardExample();
        boardExample.list();
    }
}
