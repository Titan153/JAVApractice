package com.titanium.aug114.main;
//시작 
//컴퓨터가 동전을 가지고 있고(20개)
//컴퓨터가 유저한테 동전 중에서 몇 개로 할지 물어보고
//유저가 답하고(20개 중에 몇개)
//컴퓨터가 짤짤이 해서
//유저한테 홀/짝 물어봐서
//판정

import java.util.Scanner;

public class User {
	public int pickCoin() {
		Scanner sc = new Scanner(System.in);
		System.out.print("컴퓨터의 동전 개수 입력 : ");
		int pick = sc.nextInt();
		System.out.println("유저가 동전갯수를 골랐습니다.");
		if(pick>0&&pick<=20) {
			System.out.println("동전갯수가 입력되었습니다");
			return pick;
		}else {
			System.out.println("잘못입력하셧습니다.");
			return pickCoin();
		}
	}
	public int checkCoin() {//홀짝 물어보기 //번호로 입력받기
		Scanner sc = new Scanner(System.in);
		System.out.printf("동전의 앞면 갯수 ? \n1. 홀 | 2. 짝\n");
		System.out.print(">>> : ");
		int input = sc.nextInt();
		if(input == 1) {
			System.out.println("나는 홀수로 간다!");
		}else if(input == 2) {
			System.out.println("나는 짝수로 간다!");
		}else {
			System.out.println("범위 초과 다시 입력하세요.");
			return checkCoin();
		}
		return input;
	}
}
