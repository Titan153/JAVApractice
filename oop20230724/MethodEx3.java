package oop20230724;

public class MethodEx3 {
	//sign 메소드 : 정수 n을 매개변수로 전달받아 부호를 판별하여 전달
	//(n이 양수이면 1, 음수이면 0을 return 하도록 하시오.)
	public static int isSign(int n) {//int sign 이기떄문에 리턴값도 int로 가야한다
		if(n >=0)
			return 1;
		else
			return 0;
	}
	
	public static void main(String[] args) {
		//sign 메소드 : 정수 n을 매개변수로 전달받아 부호를 판별하여 전달
		//(n이 양수이면 1, 음수이면 0을 return 하도록 하시오.)
		//main()메소드에서 호출한 sign메소드를 정의하기
		//main()메소드에서 1이면 "양수"출력, 0이면 "음수"출력
		int number = -7;
		int result = isSign(number);
		if(result==1)
			System.out.println("양수");
		else
			System.out.println("음수");
		
	}

}
