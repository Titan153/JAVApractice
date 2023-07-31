package oop20230705;

public class PrintEx1 {

	public static void main(String[] args) {
		System.out.println("ABC");
		System.out.println("XYZ");
		System.out.println("A");
		System.out.println("홍길동");
		System.out.println("한글");
		System.out.println("10");
		
		System.out.println(10+1);//11 (+산술덧셈연산자)
		System.out.println("10+1");//10+1
		System.out.println("10"+1);//101 (+문자열연산자)
		
		System.out.println("나이 : 20+1세");
		System.out.println("나이 : " + 20+1 + "세");
		System.out.println("나이 : " + (20+1) + "세");
		
		int age = 100; // 변수의 초기화문(변수의 선언문; + 변수의 대입; Assignment)
		
		System.out.println("2023년 나이 : " + age + "세");
		age = age + 1;
		System.out.println("2024년 나이 : " + age + "세");
		
		System.out.println("이름 : " + "홍길동" + "귀하");
		System.out.println("나이 : " + age  + "세");
		System.out.printf("나이 : %d세\n", age);// printf 는 (  , )양식으로 작성
		//%가 두개면 쉼표도 두개, d자리에 d의 형태로 에이지를 출력해라
		System.out.printf("이름 : %s, 나이 : %d\n", "홍길동", age);

	}

}
