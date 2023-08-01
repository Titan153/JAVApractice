package oop20230724;

public class MethodEx1 {
	public static boolean leapYear(int y) {//판단할떄는 변수이름 isleapYear 이런식으로 묻는식으로 변수를 설정함
		if((y%4==0)&&(y%100!=0)||(y%400==0))
		return true;      //윤년일 경우
		else
		return false;     //평년일 경우
	}
	public static void main(String[] args) {
		int count = 0;
		for(int year=1; year<=2023; year++) {
			if(leapYear(year)) {//year는 윤년(판단)?, true,false
				//if(leapYear(year)==true)
				//if(!leapYear(year)) 이런식으로도 표현함
				count++;		//true일경우 9번라인에와서 1을 ++한다.
			}
		}
		System.out.println("서기 1년에서 서기 2023년 까지 윤년 : " + count);
	}

}
