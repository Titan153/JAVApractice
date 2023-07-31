package oop20230718;

public class LottoEx {

	public static void main(String[] args) {
		// 난수 생성(2) : 로또
		// 클래스명(파일명) : LottoEx.java
		// 처리순서 : 난수생성 -> 중복데이터 검사(단순if { break; }
		//[결과]
		//이번회차 로또 번호 : [23][41][21][19][34][22]
		// 더더더... 구현은
		// 본인입력한 번호와 이번회차 번호로 당첨 확인하기 구현
		int[] ball = new int[45];
		for(int i=0; i<ball.length; i++) {
			ball[i] = i+1;
		}
		int tmp = 0;
		int j = 0;//같은수가 중복으로 나올경우 중복을없애기위해서
		
		for (int i = 0; i < 6; i++) {//6번  랜덤한수를 입력하되 중복이 안되도록한다.
			j = (int)(Math.random()*45);
			    tmp = ball[i];
			ball[i] = ball[j];
			ball[j] = tmp;
		}
		
		System.out.print("이번회차 로또 번호 : ");
		for(int i=0; i < 6; i++) {
			System.out.printf("[%d]", ball[i]);//ball 배열을 통해서 1-45중 랜덤한수를 6번 출력한다.
		}
		

	}//main()end

}//class()end
