package oop20230719;

import java.util.Scanner;

public class ArrSubTutorial_1 {

	public static void main(String[] args) {
		// 클래스명(파일명) : ArraSubTotal.java
		// 부분합(소계)과 전체합(총계)
		// SolDesk APT는 4층 층별 2가구이다.
		// 각 가구의 거주 인원을 입력 받아
		// 각 층별 인구수(floorSum)와 전체 인구수(Sum)를 출력하기
		int [][] APT = new int[4][2];
		Scanner sc = new Scanner(System.in);
		System.out.println("1층 1호 입력:");
		APT[0][0] = sc.nextInt();
		System.out.println("1층 2호 입력:");
		APT[0][1] = sc.nextInt();
		System.out.println("2층 1호 입력:");
		APT[1][0] = sc.nextInt();
		System.out.println("2층 2호 입력:");
		APT[1][1] = sc.nextInt();
		System.out.println("3층 1호 입력:");
		APT[2][0] = sc.nextInt();
		System.out.println("3층 2호 입력:");
		APT[2][1] = sc.nextInt();
		System.out.println("4층 1호 입력:");
		APT[3][0] = sc.nextInt();
		System.out.println("4층 2호 입력:");
		APT[3][1] = sc.nextInt();
		
		
		 for(int i=0; i<APT.length; i++){
			int j=0;
			System.out.printf("%d층의 인구수는 %d명 입니다.\n",i+1,APT[i][j]+APT[i][j+1]);
		}
		 
	
		int Sum = 0;
		for(int i = 0; i < APT.length; i++) {//i=0,1,2,3
			for(int j = 0; j < APT[i].length; j++) {//				
				Sum += APT[i][j];
			}//for j end
		}//for i end
			
			System.out.printf("전체 인구수는 %d명", Sum);
	
		sc.close();
	}//main()end

}//class()end
