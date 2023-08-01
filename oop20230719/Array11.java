package oop20230719;

public class Array11 {

	public static void main(String[] args) {
		//2차원배열
		//[행][열]
		//행 : 줄,row
		//열 : 칸,column
		int[] a = new int [6];     // 4byte ex6->24byte
		int[][]aa = new int[2][3];  //2x(4byte ex3)->24byte
		//int[][]aa= {{10,20,30},{40,50,60}};
		a[0] = 1; a[1] = 2; a[2] = 3; a[3] = 4; a[4] = 5; a[5] = 6;
		//a[6] = 7; //Exception in thread"main" java.lang.ArrayIndexOutOfBoundExcetion유효한 범위가 아니다
		aa[0][0] = 10;
		aa[0][1] = 20;
		aa[0][2] = 30;
		aa[1][0] = 40;
		aa[1][1] = 50;
		aa[1][2] = 60;
	   
		// aa[3][2] = 70; 범위 벗어남
		for(int i = 0; i < 6; i++) {
			System.out.print(a[i] + " ");
		}
		
		System.out.println();
		System.out.println();
		
		//                    행 열
		System.out.println(aa[0][0]);
		System.out.println(aa[0][1]);
		System.out.println(aa[0][2]);
		System.out.println(aa[1][0]);
		System.out.println(aa[1][1]);
		System.out.println(aa[1][2]);
		
		System.out.println();
		System.out.println();
		
		for(int i = 0; i <2; i++) {
			System.out.println(aa[i][0]);
			System.out.println(aa[i][1]);
			System.out.println(aa[i][2]);
			
		}
		System.out.println();
		System.out.println();
		
		for(int i = 0; i < 2; i++) { //외부 for:고정
			
			for(int j = 0; j <3; j++) {  //내부 for: 변화
				System.out.println(aa[i][j]);
			}
		}
		System.out.println();
		
		for(int i = 0; i < 2; i++) { //외부 for:고정
			for(int j = 0; j <3; j++) {  //내부 for: 변화
				System.out.print(aa[i][j] + "\t");  // "\t"는 탭만큼 띄어쓰기
			}
			System.out.println();
			System.out.println();
		}	
		//배열의 길이(크기, 요소의 갯수): 배열 객체의 length
		//배열명.length
		//1차원 배열의 요소의 갯수
		System.out.println(a.length); //(결과)6
		//2차원 배열의 "행요소의 갯수"
		System.out.println("2차원 배열의 길이" + aa.length);   //(결과)2
		//2차원 배열의 "각 행"의 열의 갯수
		
		//0행의 열의 갯수(열크기)
		System.out.println("2차원 배열의 0행의 열의 길이:" + aa[0].length);//(결과)3
		//1행의 열의 갯수(열크기)
		System.out.println("2차원 배열의 1행의 열의 길이:" + aa[1].length);//(결과)3
		//int[][] aa = new int[2][3];
		//int[][] aa = {{10,20,30},{40,50,60}}
	}//main()end

}//class()end
