package oop20230720;

public class Method2 {
	public static void test() {
		System.out.println("test() 메서드 다녀감");
		return;
	}
	public static void test1(int a) {
		System.out.println("정수: "+ a);
	}
	public static void test2(double a) {
		System.out.println("실수: "+ a);
	}
	public static void test3(char a) {
		System.out.println("문자: "+ a);
	}
	public static void test4(String a) {
		System.out.println("문자열: "+ a);
	}
	public static void test5(int a, int b) {
		int c = a + b;
		System.out.println(a + "+" + b +"="+ c);
		return; //반환형이 void형이면, return; 생략가능
	}
	public static void main(String[] args) {
		System.out.println("main() 메서드: 프로그램실행의 시작!");
		test();
		test();
		test1(10);
		test2(3.14);
		test3('A');
		test4("SOLDESK");
		test5(20,30);
		System.out.println("main() 메서드: 프로그램 실행의 끝!");
	
	}//main()end	
	
	
}//class()end
