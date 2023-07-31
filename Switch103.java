package oop20230712;

public class Switch103 {

	public static void main(String[] args) {
		// 교재 : 103 ~ 104
		//case문 동시에 사용하기
		//각 달(1월~12월)의 날(day)수 출력하기 : 28,30,31
		int month = 7;
		int day = 0;
		
		switch (month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			day = 31;
		    break;
		case 2: 
			day = 28;
			break;
		
		case 4: case 6: case 9: case 11:
			day = 30;
			break;
		
			
		}
		
		System.out.println(month + "월의 날수는 " + day + "입니다.");

	}

}
