package oop20230717;

public class Break2 {
	public static void main(String[] args) {
		//[문제]무한 while문
		//3배수의 누적합계(hap)가 100 이 넘어가면 (초과)
		//3부터 어디까지 더해야하는지 구하세요
		//(예)3 + 6 + 9 + 12 + 15 +.....su ==> 결과 >100
		int su = 3;
		int hap = 0;
		while(true) {
			hap += su;//hap = hap + su;//(1)누적합계
			if(hap > 100)break;        //(2)종료 조건
			su += 3;  //su= su+3       //(3)다음항 준비
			
		}//while end
		System.out.println("3 + 6 + 9 + 12 + 15 +.....+ " + su + " = " + hap);
	hap = hap - su;
	su = su -3;
	System.out.println("3 + 6 + 9 + 12 + 15 +.....+ " + su + " = " + hap);
	}//main()end

}//class()end
