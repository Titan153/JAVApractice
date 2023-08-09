package com.titanium.aug091.main;

import java.util.Random;
import java.util.Scanner;

/* 가위바위보 
U    C
가위  1    - 1  = 0 무
         - 2  = -1 패 
         - 3  = -2 승

바위  2    -1 = 1 승
         -2 = 0 무
         -3 = -1 패		

보   3    -1 = 2 승
         -2 = 1패
         -3 = 0 무

*/
public class EMain3_t {

	public static void PrintStart(String[] h) {
		System.out.println("<<가위바위보 게임 시작!>>");
		System.out.println("==================");
		for(int i =1; i<h.length; i++) {
			System.out.printf("||%d. %s\t\t\n",i,h[i]);
		}
		System.out.println("==================");

	}
	//컴퓨터가 뭐 냈는지
	public static int getComHand() {
		Random r = new Random();
		int comHand = r.nextInt(3)+1;//0 1 2
		return comHand;
	}
	//유저가 뭐 냈는지 
	public static int getUserHand() {
		Scanner k = new Scanner(System.in);
		System.out.println("뭐낼래? : ");
		int userHand = k.nextInt();
		if(userHand<1||userHand>3) {
			System.out.println("잘못 입력 했습니다. 다시 입력하세요.");
		}
		return(userHand >=1 && userHand <=3)? userHand : getUserHand();
	}
	//각자 뭐 냈는지 출력
	public static void printHand(int user, int com, String[] hand) {
		System.out.println("===============");
		System.out.printf("||유저\t:%s\t||\n",hand[user]);
		System.out.printf("||컴퓨터\t:%s\t||\n",hand[com]);
		System.out.println("===============");
	}
	//게임 한판에 대한 판정
	public static int judge(int user, int com) {
		int game = user - com;
		if (game==0) {
			System.out.println("무승부");
			return 0;
		}else if(game ==-1||game==2) {
			System.out.println("패배");
			return -123123;
		}else {
			System.out.println("승리");
			return 1;
		}
		
	}
	//유저가 질 때까지 진행한 후에 한번 질 동안 몇승했는지 그 결과를 받아옴
	public static int getResult(String[] hand) {
		int com = 0;  //컴퓨터가 낼 기본값
		int user = 0; //유저가 낼 기본값
		int win = 0; //연승 횟수 기본값
		int result = 0; //결과 기본값
		
		while(true) {
			com = getComHand();
			user = getUserHand();
			printHand(user, com, hand);
			result = judge(user,com);
			if(result == -123123) {
				break;
			}
			win +=result;//이겻을 때 return을 1로 받아서 카운팅이 가능해짐
		}
		return win;
	}
	//연승에 대한 결과를 출력
	public static void printResult(int win) {
		System.out.println("====================");
		System.out.printf("||%d연승으로 종료!\t||\n",win);
		System.out.println("====================");
	}
	//기능 모아주기
	public static void activate() {
		String[] hand = {"ㅋ","가위","바위","보"};
		PrintStart(hand);
		
		int win = getResult(hand);
		printResult(win);
		
	}
	
	public static void main(String[] args) {
		activate();
	}
}//class end
