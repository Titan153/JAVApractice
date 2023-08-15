package com.titanium.aug114.main;

import java.util.Random;
import java.util.Scanner;
//선생님의 문제의도는 20개를 가지고 흔들어서 동전 몇개? 홀수/짝수
//였고 우리가 고민한것은 버전 업되서
//20개중에 고른 동전의 앞뒤를 파악하는 문제로 난이도Up
//컴퓨터가 동전을 가지고 있고(20개)

//컴퓨터가 유저한테 동전 중에서 몇 개로 할지 물어보고
//유저가 답하고(20개 중에 몇개)

//컴퓨터가 짤짤이 해서//앞뒤 1,0 
//유저한테 홀/짝 물어봐서
//판정
public class Computer_1 {
	
	int[] coins;

	public int askUser() {
		int numsOfcoins;
		User u = new User();
		numsOfcoins = u.pickCoin();
		return numsOfcoins;
	}
	public int[] mixCoin(int numsOfcoins) {
		coins = new int[numsOfcoins];
		Random coinPicker = new Random();
		for (int i = 0; i < coins.length; i++) {
			coins[i] = coinPicker.nextInt(2);
//			System.out.println("배열 값 : " + coins[i]);
		}
//		for(int coin : coins) {
//			coins[i] = coinPicker.nextInt(2);// 이렇게되면 int coin값이 저장되서 배열값반환 이아니라 
//		}										//만들어져서 지역변수로 쓰이고 버려짐
//		System.out.println(coins);
		return coins;
	}
	public int chooseOddEven() {
//		System.out.println(coins);
//		System.out.println("coins 배열 길이 : " + coins.length);
		for(int coin : coins) {
//			System.out.println("mixCoin 후 배열 값 : " + coin);
		}
		int count = 0;
		//배열값은 1앞,0뒤 로 구분된다 원래는 앞뒤도 물어봐야하지만 그냥 1 앞면갯수 기준으로 홀수인지 짝수인지 물어보자.
			for(int i = 0; i < coins.length;i++) {
				if(coins[i]==1) {
					count++;
				}
			}//for end
//			System.out.println("컴동전앞면갯수 : " + count);
			return count;
		}
	  
	public void judge(int count) {
		User u = new User();
		int judgeResult = u.checkCoin();//홀짝 받는용도
		if(judgeResult==1&&count%2!=0) {
			System.out.println("홀수! 정답");
		}else if(judgeResult==2&&count%2==0) {
			System.out.println("짝수! 정답");
		}else {
			System.out.println("땡 틀렸어요.");
		}
	}

	public void activate() {
		
		mixCoin(askUser());
		judge(chooseOddEven());
	}
	
}
