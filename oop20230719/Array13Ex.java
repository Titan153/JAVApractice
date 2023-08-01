package oop20230719;

public class Array13Ex {

	public static void main(String[] args) {
		// 클래스명(파일명) : Array13Ex.java
		// 성적 처리 프로그램
		// 국어, 영어, 수학 과목의 총점과 평균 구하기
		// int[][] score = { 5명학생의 3과목점수 };
		// int[] stdTotal[] = new int[5]; // (학생)개인별 총점
		// float[] stdAvg[] = new float[5]; // (학생)개인별 평균
		// int[] subTotal[] = new int[3]; // (3)과목별 총점
		// float[] subAvg[] = new float[3]; // (3)과목별 평균
		int[][] score = { {99,98,97},
						{89,88,87},
						{79,78,77},
						{69,68,67},
						{59,58,57}};
		int korTotal = 0, engTotal = 0, mathTotal = 0;
		System.out.println("  번호   국어   영어   수학     총점      평균");
		System.out.println("------------------------------------");
		
		
		for(int i = 0; i<score.length; i++) {
			int stdTotal = 0;       //개인별 총점
			float stdAvg = 0.0f;  //개인별 평균
			korTotal+=score[i][0];
			engTotal+=score[i][1];
			mathTotal+=score[i][2];
			System.out.printf("%5d", i + 1);
			
			for(int j = 0; j < score[i].length; j++) {
				stdTotal+=score[i][j];
				System.out.printf("%5d",score[i][j]);
				
			}
			
			stdAvg = (float)stdTotal/(float)score[i].length;
			System.out.printf("%8d %8.1f \n", stdTotal, stdAvg);
			System.out.println();
		}//(i)for end//학생 단위 반복
		System.out.println("======================================");
		System.out.printf("과목별총점 : %3d  %3d  %3d \n", korTotal, engTotal, mathTotal);
		System.out.printf("과목별평균 : %d  %d  %d",korTotal/3,engTotal/3,mathTotal/3);
	}//main()end

}//class()end
