package com.titanium.aug091.main;

import java.util.Scanner;

public class EMain1 {
	
	public static void active() {
		Scanner sc = new Scanner(System.in);
		System.out.println("1.학생수 입력.");
		System.out.println("2.학생의 점수 입력.");
		System.out.println("3.학생의 점수리스트.");
		System.out.println("2.최고점수와 평균점수.");
		System.out.println("5.프로그램 종료.");
		
		int[]studentNum = null;
		int i = 0;
		int chNum = 0;
		int studentPoint = 0;
		int sum = 0;
		int avg = 0;
		
		
		
		while(true) {
				chNum = sc.nextInt();
			switch(chNum) {
			case 1 ://1.Insert - 학생수입력
				
				System.out.println("학생수를 입력하세요.");
				i = sc.nextInt();
				studentNum = new int[i];
				break;
			
			case 2://2.Insert - 학생의 점수입력
				
				if(studentNum==null) {
					System.out.print("점수가 입력되지 않았습니다.\n1번을 눌러 학생수를 입력해주세요.");
				}else{
					System.out.println("학생들의 점수를 입력하세요.");
				}
				for(i=0; i<studentNum.length; i++) {
					if(studentPoint>100 || 0>studentPoint) {
						System.out.println("잘못입력 하셨습니다.");
						}
					System.out.printf("%번 학생의 점수를 입력하세요.", i+1);
					studentPoint = sc.nextInt();
					studentPoint = studentNum[i];
					}//for end
				break;
			
			case 3://3.학생의 점수리스트 출력
				
				for(int i1 = 0; i1 < studentNum.length; i1++) {
				System.out.printf("%d번 학생 점수 :%d점\n", i1+1, studentNum[i1]);
				}
				break;
				
			case 4://4.최고점수와 평균점수 분석
				
				for(int j = 0; j<studentNum.length; j++) {
					sum =+ studentNum[j];
				}
				System.out.println("평균점수"+(sum/studentNum.length));
				break;
			default://5.Exit - 프로그램 종료
				System.out.println("프로그램을 종료합니다. 이용해주셔서 감사합니다.");
				System.exit(0);
				break;	
			
			 }//switch end
			
		}//while end	 
	}//메소드 end
	
	public static void main(String[] args) {
		
	//메소드를 만들어서 진행
	//1을 입력하면 학생수 값을 입력받을수 있게
	//2를 입력하면 각 학생들의 점수를 입력 받을수 있게(점수 범위를 고려o)
	//     점수 범위를 벗어나면 다시 입력!
	//3을 입력하면 학생들의 점수리스트를 출력할수 있게(ex 1번 학생 점수 :50점)
	//4를 입력하면 최고점수와 평균점수를 분석해서 출력할 수 있게
	//5를 입력하면 프로그램 종료
	// 메뉴 선택 화면
		active();
		
		}//main()end
	
}//class end
