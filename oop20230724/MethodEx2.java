package oop20230724;

public class MethodEx2 {
	//guGu메소드: 정수n을 매개변수로 전달받아 구구단 중 n단을 메서드 안에서 출력
	public static void guGu(int n) {
		//(1)정수n을 매개변수로 전달 받아
		//(2)구구단 중 n단을 매서드 안에서 출력
		for(int i = 0; i <= 9; i++) {
			System.out.println(n + "x" + i + "=" + (n*i));
		}
	}
	public static void main(String[] args) {
		
		//main{}메소드에서 호출한guGu메소드를 정의하기
		int times = 3; //(3단)구구단 출력 프로그램
		System.out.println("==[" + times + "단]===");
		guGu(times);	//times(매개변수, 인수, 인자)전달하여 guGu메소드 호출
		System.out.println("=========");

	}

}
