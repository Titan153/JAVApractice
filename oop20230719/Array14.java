package oop20230719;

public class Array14 {

	public static void main(String[] args) {
		//2차원 가변 배열(jagged Array)
		//배열의 열크기가 일정하지 않은 배열
		//(예)달력 12개월 각각의 날짜수(28, 29, 30, 31)가 다름 12(행) x 변화크기(열)
		//2차원 배열 : 열크기가 다른 행들의 배열
		//          열크기 생략 ->열크기가 일정하지 않음
		//			  new int [4][2];
		// ch) new int[4][2];    //모든 행의 열크기가 같은 배열
		int[][]twoD = new int[4][];
		twoD[0] = new int[1];
		twoD[1] = new int[2];
		twoD[2] = new int[3];
		twoD[3] = new int[4];
		
		
		int num = 1;
		for(int i = 0; i < twoD.length; i++) {//행 고정
			for(int j =0; j < twoD[i].length; j++) {// 열 변화
				twoD[i][j] = num++;
				System.out.printf("%d", twoD[i][j]);
			}
			System.out.println();
		}
		//"2차원 배열에서..."
		//배열(참조변수)명.length : 행크기(길이)
		//배열(참조변수)명[행위치].length :해당 행위치의 열크기(길이)
		
//		#교재 : 219page ~ 221 page
//      #이차원 배열 초기화 :  220 page
//      #이차원 배열 길이 : 221page 		
	}

}
