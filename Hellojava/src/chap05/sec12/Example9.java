package chap05.sec12;

import java.util.Scanner;

public class Example9 {

    public static void main(String[] args) {

        boolean run = true;
        Scanner sc = new Scanner(System.in);

        int[] score = null;

        while (run) {
            System.out.println("----------------------------------------------------");
            System.out.println("1. 학생수 | 2. 점수 입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
            System.out.println("----------------------------------------------------");
            System.out.print("선택 > ");
            String select = sc.nextLine();

            if (select.equals("1")) {
                System.out.println("학생 수를 입력하세요");
                int student = Integer.parseInt(sc.nextLine());
                System.out.println("학생수는 " + student + "명 입니다.");
                score = new int[student]; 
            } else if (select.equals("2")) {
                for (int i = 0; i < score.length; i++) {
                	System.out.print("score [" + (i + 1) + "]:");
                	score[i] = Integer.parseInt(sc.nextLine());}
            } else if (select.equals("3")) {
                System.out.println("점수 리스트:");
                for (int i = 0; i < score.length; i++) {
                    System.out.println("score [" + (i + 1) + "]: " + score[i]);
                }
            } else if (select.equals("4")) {
            	System.out.println("분석을 선택했습니다.");
           } else {
        	   run=false;
        	   System.out.println("프로그램 종료입니다.");
           } 
        }
    }
}