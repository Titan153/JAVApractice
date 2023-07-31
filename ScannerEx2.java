package oop20230706;
// 자동 완성 단축키 : ctrl +space
import java.util.Scanner;

public class ScannerEx2 {

	public static void main(String[] args) {
		//선언
		Scanner sc = new Scanner(System.in);
		String name;
		int age;
		double height;
		char ch;
		//입력
		System.out.println("이름: ");
		name = sc.next(); //문자열
		System.out.println("나이: ");
		age = sc.nextInt(); //정수
		System.out.print("키: ");
		height = sc.nextDouble();
		System.out.print("문자: ");
		ch = sc.next().charAt(0);  //문자
		//연산,처리
		//출력
		System.out.println(name + " 의 나이는 " + age + "세 입니다." );
		System.out.println(name + "의 키는 " + height + "cm 입니다.");
		System.out.println("문자 : " + ch);
		sc.close();
				
	}

}
