package oop20230712;

import java.util.Scanner;

public class SelectionEx8 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("국어점수는: ");
		int kor = scanner.nextInt();
		
		System.out.println("영어점수는: ");
		int eng = scanner.nextInt();
		
		System.out.println("수학점수는: ");
		int math = scanner.nextInt();
		
		int avg = (kor + eng + math)/3;
		System.out.println("평균점수는: " + avg + "점.");
		
		if( avg >= 70 && kor >= 50 && eng >= 50 && math >= 50 ) {
			System.out.println("합격.");
		}else if( avg >= 70 && kor < 50 && eng >= 50 && math >= 50 ) {
			System.out.println("과락.");
		}else if( avg >= 70 && kor >= 50 && eng < 50 && math >= 50 ) {
			System.out.println("과락.");
		}else if( avg >= 70 && kor >= 50 && eng >= 50 && math < 50 ) {
			System.out.println("과락.");
		}else if( avg >= 70 && kor < 50 && eng < 50 && math < 50 ) {
			System.out.println("과락.");
		}else {System.out.println("불합격.");}
		
		scanner.close();
		// 국어, 영어, 수학 점수를 입력 받아서, 평균을 구한 후, kor, eng, math made to int and get avg
		// "합격", "불합격" 출력하기 use if print pass false
		// 평균이 70 이상이고, 모든 과목이 50 이상이어야 합격 avg>=70, kor >= 50, eng >= 50, math >= 50
		// 불합격의 경우는 과락과 불합격으로 구분 false1 false2
		// 과락 : 평균이 70 이상이더라도, 한 과목이라도 50미만이면 과락 false1 avg >=70, 
		// 불합격 : 나머지는 불합격 
	}

}
