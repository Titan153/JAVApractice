package com.titanium.aug091.main;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthColorChooserUI;

//가위바위보 게임(메소드 활용o)Math.random()
//1.가위->콘솔창에 1을 입력하면 가위
//2.바위->콘솔창에 2를 입력하면 바위
//3.보 ->콘솔창에 3을 입력하면 보
//컴퓨터와 가위바위보 해서 1번 질동안 몇승하는지 출력할수있게

public class EMain3 {
		
	//게임시작하면서 룰 설명 //룰 설명메소드
	//컴퓨터가 뭐 냈는지    //컴퓨터,유저 뭐 냈는지 출력
	//유저가 뭐 냈는지
	//각자 뭐 냈는지 출력
	//게임 한판에 대한 판정 //판정 메소드	
	//유저가 질 때까지 진행한 후에 한번 질돌안 몇승했는지 그 결과를 받아옴
	//연승에 대한 결과를 출력
		
		
	public static void Rule() {
		System.out.println("===      가위,바위,보 게임     ===");
		System.out.println("===   1~3중 아무숫자를 입력하세요 ===");
		System.out.println("===          1.가위        ===");
		System.out.println("===          2.바위        ===");
		System.out.println("===          3.보          ===");
	}
	public static int What() {
		System.out.println("\n가위! 바위! 보!(1~3누르세요)");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num==1) {
			System.out.println("'가위'를 냈습니다.");
		}else if(num==2) {
			System.out.println("'바위'를 냈습니다.");
		}else if(num==3) {
			System.out.println("'보'를 냈습니다.");
		}else {
			System.out.println("다시 입력하세요");
		}return num;	
	}
	public static int computerWhat() {
		int compNum = (int)(Math.random()*4);
		if(compNum==1) {
			System.out.println("컴퓨터는 '가위'를 냈습니다.");
		}else if(compNum==2) {
			System.out.println("컴퓨터는 '바위'를 냈습니다.");
		}else if(compNum==3) {
			System.out.println("컴퓨터는 '보'를 냈습니다.");
		}else {
			System.out.println("컴퓨터가 긴장해서 선뜻 내지 못하고있습니다.");
			System.out.println("보통내기가 아니군..");
		}return compNum;	
	}
	public static void judge() {
		if(What()==computerWhat()) {
			System.out.println("비겼습니다.");
		}
		
		
	}
	public static void main(String[] args) {
			Rule();
			computerWhat();
			judge();
		
	}
}//class end
