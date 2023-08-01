package oop20230720;

public class Method6 {
	//(1)두 정수 초기화 ->(2)덧셈 ->(3)출력 
		//[callee]                                       [caller] 
		//add3 메소드 기능 : (1)두 정수를 초기화 하고 (2)덧셈(결과반환)            / main 메소드 기능 : 출력(3)
	
		public static int add3() { // 변수x,y : 지역변수
		    //(1)두 정수 초기화
			int num1 = 20;
			int num2 = 30;
			int num3;
			//(2)덧셈
			num3 = num1 + num2;
			return num3;
		}
		public static void main(String[] args) {
			int num3 =add3();
			//(3)출력
			System.out.println(num3);
			
		}//main()end
		
	}//class()end
