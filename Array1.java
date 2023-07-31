package oop20230717;

public class Array1 {

	public static void main(String[] args) {
		//국어 80점, 영어 60점, 수학 100점
		//각 과목의 점수를 출력!
		//(1) 변수 1개만 사용하여..
		int score; //4byet =32bit
		score = 80;
		System.out.println("국어 점수 : "+ score);
		score = 60;
		System.out.println("영어 점수 : "+ score);
		score = 100;
		System.out.println("수학 점수 : " + score);
		//일괄 처리 불가능, 입력 -> 처리 -> 출력 구분 불가능
		
		//(2)변수 3개를 사용하여...
		//자료구조(Data structure): 자료 + 처리방법
		int korScore = 80;
		int engScore = 60;
		int mathScore = 100;
		System.out.println("국어점수 : " + korScore);
		System.out.println("영어점수 : " + engScore);
		System.out.println("수학점수 : " + mathScore);
		
		
		//(3)1차원 배열 사용하여...
		int[] s = new int[3]; //4byte x 3 - >12byte
		s[0]=80;
		s[1]=60;
		s[2]=100;
		System.out.println("국어점수 : " + s[0]);
		System.out.println("영어점수 : " + s[1]);
		System.out.println("수학점수 : " + s[2]);
		
		for(int i = 0; i < 3; i++) {
			System.out.println("점수: " + s[i]);
		}

	}

}
/*
 * ===자료형(data type)===
 * 
 * 1.기본형(primitive type): stack memory
 * 1)정수형 : byte(1), char(2), short(2), "int(4)", iong(8)
 * 2)실수형 : float(4), "double(8)"
 * 3)논리형 : boolean(1)
 * 
 * 2.참조형(레퍼런스형, reference type), 확장형, 사용자 정의형 : heap memory
 * 1)배열형
 * 2)열거형
 * 3)클래스형 : String
 * 4)인터페이스형
 * ===배열변수(stack) vs 배역(객체, heap) ===
 * - 배열(array) : 확장자료형 > 동질형  자료의  연속적 모임
 *                         (같은 타입끼리)(메모리 주소)
 *                         int int int   
 *                         double double double
 *                         char char char 
 *                         String String String
 * 
 *                          요소들(element) 여러개를 묶었다.
 *                          일괄처리(Batch, 배치)
 * 
 */