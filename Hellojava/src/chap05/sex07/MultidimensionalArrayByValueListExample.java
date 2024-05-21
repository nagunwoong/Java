package chap05.sex07;

public class MultidimensionalArrayByValueListExample {

	public static void main(String[] args) {
		//2차원 배열 생성
		int[][] scores = {
				{80, 90, 96},
				{76, 88}
		};
		
		//배열의 길이
		System.out.println("1차원 배열 길이(반의 수): " + scores.length);
		System.out.println("2차원 배열 길이(첫 번째 반의 수): " + scores[0].length);
		System.out.println("3차원 배열 길이(드 번째 반의 수): " + scores[1].length);

		//첫 번째 반의 세 번째 학생의 점수 읽기
		System.out.println("첫 번째 반의 세 번째 학생의 점수: " + scores[0][2]);
		//두 번째 반의 두 번째 학생의 점수 읽기
		System.out.println("첫 번째 반의 세 번째 학생의 점수: " + scores[1][1]);
		
		//첫 번째 반의 합계 점수 구하기
		int sum1 = 0;
		for (int i=0; i<scores[0].length; i++) {
			sum1 += scores[0][i];
		}
		System.out.println("첫 번째 반의 합계 : " + sum1);
		
		//첫 번째 반의 평균 점수 구하기
		double avg1 = 0;
		avg1 = sum1 / scores[0].length;
		System.out.println("첫 번째 반의 평균 : " + avg1);
		
		//두 번째 반의 합계 점수 구하기
		int sum2 = 0;
		for(int j=0; j<scores[1].length; j++) {
			sum2 += scores[1][j];
		}
		System.out.println("두 번째 반의 합계 : " + sum2);
	
		//두 번째 반의 평균 점수 구하기
		double avg2 = 0;
		avg2 = sum2 / scores[1].length;
		System.out.println("두 번째 반의 평균 : " + avg2);
		
		//전체 학생의 평균 점수 구하기
		int totalStudent = 0;
		int totalSum = 0;
		for(int i=0; i<scores.length; i++) { //반의 수 만큼 반복
			totalStudent += scores[i].length; //반의 학생 수 합산
			for(int k=0; k<scores[i].length; k++) {
				totalSum += scores[i][k]; //학생 점수 합산
			}
		}		
		double totalAvg = (double) totalSum / totalStudent;
		System.out.println("전체 학생의 평균 점수 : " + totalAvg);
		
	}
}
