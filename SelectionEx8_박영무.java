package oop20230712;

import java.util.Scanner;

public class SelectionEx8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int kor, eng, math;
		
		System.out.print("국어 점수: ");
		kor = scanner.nextInt();
		System.out.print("양어 점수: ");
		eng = scanner.nextInt();
		System.out.print("수학 점수: ");
		math = scanner.nextInt();
		
		
		double mean_score = (double)(kor + eng + math)/3;
		if(mean_score >= 70	) {
			if (kor >= 50 && eng >= 50 && math >= 50) {
				System.out.println("합격");
			} else {
				System.out.println("과락");
			}
		} else {
			System.out.println("불합격");
		}
		scanner.close();
	}

}
