package oop20230802;

import java.util.Scanner;

class Week{
	public static final int MON = 1;
	public static final int TUE = 2;
	public static final int WED = 3;
	public static final int THU	= 4;
	public static final int FRI = 5;
	public static final int SAT = 6;
	public static final int SUN = 7;
}

interface Week2 {
	//인터페이스 내의 필드(변수)는 "무조건" public static final로 선언(초기화)한다.
	int MON = 1, TUE = 2, WED = 3, THU = 4, FRI = 5, SAT = 6, SUN = 7;
	
	
}

public class InterfaceEx5 {
	
	public static void main(String[] args) {
		
		System.out.println("오늘의 요일을 선택하시오.");
		System.out.println("1.월, 2.화, 3.수, 4.목, 5.금, 6.토, 7.일");
		System.out.println("입력> ");	
		Scanner sc = new Scanner(System.in);
		int sel = sc.nextInt();
		sc.close();
		
		switch(sel) {
		case Week2.MON: System.out.println("주간회의가 있습니다");			break;
		case Week2.TUE: System.out.println("프로젝트 기획회의가 있습니다");	break;
		case Week2.WED: System.out.println("중간 보고하는 날입니다.");		break;
		case Week2.THU: System.out.println("동아리 참석하는 날입니다.");		break;
		case Week2.FRI: System.out.println("프로젝트 마감일 입니다.");		break;
		case Week2.SAT: System.out.println("늦잠자며 즐거운 휴식을 보내세요.");break;
		case Week2.SUN: System.out.println("오늘은 휴일입니다.");			
		}
	}

}
