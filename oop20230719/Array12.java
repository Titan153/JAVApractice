package oop20230719;

public class Array12 {

	public static void main(String[] args) {
		//2차원 배열의 선언 및 초기화(Initialize)
		int[][] num = {
				{10, 20, 30}, //num[0][0],num[0][1],num[0][2]
				{40, 50, 60}, //num[1][0],num[1][1],num[1][2] 
				{70, 80, 90}  //num[2][0],num[2][1],num[2][2]
		};
		
		int row = num.length;
		int col = num[0].length;
		System.out.println(row + "행" + col + "열");
		
		//0. 전체 요소의 합계
		int sum = 0;
		for(int r = 0; r < row; r++) {
			for(int c = 0; c <col; c++) {
				sum += num[r][c];
			}
		}
		System.out.println("전체 합계 : " + sum);
		
		//1. 각 행의 합계 출력
		int rowSum = 0;
		for(int r = 0; r < row; r++) {
			rowSum = 0;
			for(int c = 0; c < col; c++) {
				rowSum += num[r][c];
			    //sum += num[r][c];
			}
			//sum += rowSum; //sum = sum + rowSum;//3개 소계의 합계 누적
			System.out.println(r + "행의 합계 : " + rowSum);
		}
		System.out.println("전체 합계 : " + sum);
		
	
		//2. 각각의 대각선(↘,↙)의 합계 출력
//		int[][] num = {
//		{10, 20, 30}, //num[0][0],num[0][1],num[0][2]
//		{40, 50, 60}, //num[1][0],num[1][1],num[1][2] 
//		{70, 80, 90}  //num[2][0],num[2][1],num[2][2]
//};
		int sum1 = 0;    
		int sum2 = 0;
		for (int i = 0; i <3; i++) {
			sum1+=num[i][i];
			sum2+=num[i][2-i];
		}
		System.out.println(sum1);
		System.out.println(sum2);

	}

}
