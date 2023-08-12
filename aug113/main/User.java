package com.titanium.aug113.main;
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
		int pick = sc.nextInt();
		System.out.println("유저가 코인갯수를 골랐습니다.");
		return pick;
	}
}
