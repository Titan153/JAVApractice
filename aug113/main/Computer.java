package com.titanium.aug113.main;

import java.util.Random;
import java.util.Scanner;

//시작 
//컴퓨터가 동전을 가지고 있고(20개)
//컴퓨터가 유저한테 동전 중에서 몇 개로 할지 물어보고
//유저가 답하고(20개 중에 몇개)
//컴퓨터가 짤짤이 해서
//유저한테 홀/짝 물어봐서
//판정
public class Computer {
	
	public int userCheck() {
		User u = new User();
		System.out.printf("동전 갯수를 1~20중에 선택하세요\n>>>");
		int coinNum = u.pickCoin();
		if(coinNum > 0 && coinNum<=20) {
			System.out.printf( "짤짤이 진행합니다.\n");
		}else {
			System.out.println("범위초과 다시 입력하세요.");
		}
		return coinNum;
	}
	//짤짤이 // 앞이면 0 뒤면 1//000 111
	public int oddEven() {
		Random r = new Random();
		int zeroOne = r.nextInt(2);
		int comNum = userCheck();
		boolean[] arr = new boolean[comNum];
		
		return zeroOne;
	}
	
	public int askUser() {
		System.out.println("1.홀/2.짝 고르세요");
		Scanner sc = new Scanner(System.in);
		int ans = sc.nextInt();
		if(ans == 1) {
			
			
		}else if(ans == 0) {
			return 0;
		}else {
			System.out.println("다시 입력하세요");
		}
		return 0;
	}
//		for(int i = 0; i<arr.length;i++) {
//			arr[i]= oddEven;
//		}
//		if(oddEven == 0) {
//			arr[i]= true;
//			System.out.printf("[앞]");
//			}else if(oddEven == 1) {
//				arr[i] = false;
//				System.out.printf("[뒤]");
//			}
//		if(arr[i]==true) {
//		}else {
//		}
		
//		}//for end
	

}//class end
