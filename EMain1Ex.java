package com.titanium.aug091.main;

import java.util.Scanner;

//메소드를 만들어서 진행
	//1을 입력하면 학생수 값을 입력받을수 있게
	//2를 입력하면 각 학생들의 점수를 입력 받을수 있게(점수 범위를 고려o)
	//     점수 범위를 벗어나면 다시 입력!
	//3을 입력하면 학생들의 점수리스트를 출력할수 있게(ex 1번 학생 점수 :50점)
	//4를 입력하면 최고점수와 평균점수를 분석해서 출력할 수 있게
	//5를 입력하면 프로그램 종료
public class EMain1Ex {
	
	public static void start() {
		System.out.println("================================");
		System.out.println("\t\t1.학생수|5.종료");
		System.out.println("================================");
	}
	public static void showMenu() {
		System.out.println("==================================");
		System.out.println("1.학생수|2.점수입력|3.점수리스트|4.분석|5.종료");
		System.out.println("==================================");
		
	}
	//선택할 메뉴 번호 받아오기
	public static int getSelectNo() {
		Scanner k = new Scanner(System.in);
		System.out.println("선택>");
		int selectNo = k.nextInt();
		return selectNo;
	}
	//학생 수 값 받아오기
	public static int getStudentNum() {
		Scanner k = new Scanner(System.in);
		System.out.println("학생 수 :");
		int studentNum = k.nextInt();
		return studentNum;
	}
	//학생 개인의 점수를 받아오기
	public static int getScore() {
		Scanner k = new Scanner(System.in);
		int score = k.nextInt();
		if(score>100) {
			System.out.println("점수는 100점을 넘을수 없습니다.");
			System.out.println("다시 입력:");
		}else if(score<0) {
			System.out.println("점수는 0점보다 낮을수 없습니다.");
			System.out.println("다시 입력:");
		}
		return(score >= 0 && score <= 100)? score : getScore();
	}
	//학생들의 점수를 입력하기
	public static int[] getScore(int[] scores) {
		for(int i = 0; i<scores.length;i++) {
			System.out.printf("%d번 학생 점수 입력: ",i+1);
			scores[i]=getScore();
		}
		return scores;
	}
	//학생들의 점수를 출력하기
	public static void PrintScore(int[] scores) {
		int index = 1;
		for(int i : scores) {
			System.out.printf("%d번 학생 점수 : %d점\n", index++,i);
		}
	}
	public static void printStats(int[] scores) {
		int max = 0;
		int sum = 0;
		for(int i : scores) {
			sum+=i;
			max = (max < i)? i : max;
		}
		double avg = (double)sum/scores.length;
		System.out.printf("최고 점수 : %d점\n",max);
		System.out.printf("평균 점수: %.2f점\n",avg);
	}
	public static void end() {
		System.out.println("\t\t종료합니다.");
		System.out.println("===================");
	}
	public static void activate() {
		int selectNo=0;
		int studentNum=0;
		int[]scores=null;
		
		start();
		selectNo = getSelectNo();
		if(selectNo==1) {
			studentNum = getStudentNum();
			scores = new int[studentNum];
			while(true) {
				showMenu();
				selectNo=getSelectNo();
				if(selectNo==1) {
					studentNum = getStudentNum();
					scores = new int[studentNum];
				}else if(selectNo==2) {
					getScore(scores);
				}else if(selectNo==3) {
					PrintScore(scores);
				}else if(selectNo==4) {
					printStats(scores);
				}else if(selectNo==5) {
					end();
					break;
				}else {
					System.out.println("\t입력이 잘못되었습니다.");
					System.out.println("\t다시 입력해주세요.");
				}
			}//while end
		}else if(selectNo==5) {
			end();
		}else {
			System.out.println("\t입력이 잘못 되었습니다.");
			System.out.println("\t다시 입력해주세요.");
		}
		
		
	}
	public static void main(String[] args) {
		activate();
	}
	
	
	
	
	
}//class end
