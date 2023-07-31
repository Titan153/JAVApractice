package oop20230712;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("국어 점수를 입력하세요:");
		int kor = sc.nextInt();
		System.out.println("영어 점수를 입력하세요:");
		int eng = sc.nextInt();
		System.out.println("수학 점수를 입력하세요:");
		int math = sc.nextInt();
		
		double avg = (double)(kor + eng + math)/3;
		
		if(avg >= 70) {
			if(kor >= 50 && eng >= 50 && math >= 50) {System.out.println("합격입니다.");
			
			}else {System.out.println("과락입니다.");
		}
	}else {System.out.println("불합격입니다.");
	}sc.close();
	}//main()end

}//class()end
