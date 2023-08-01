package oop20230719;

import java.lang.reflect.Array;
import java.util.Arrays;

public class LottoEx1 {

	public static void main(String[] args) {
		// 난수 생성(2) : 로또
		// 처리순서 : 난수생성 -> 중복데이터 검사( 단순if { break; } )
		// [결과] 이번 회차 로또 번호 : [23][41][21][19][34][22]
		int[] ball = new int[6];
		int temp;
		for(int i = 0; i < 6; i++) {
			// 난수(랜덤)생성 범위 : 1이상(부터)~45이하(까지)
			temp = (int)(Math.random()*45) + 1;
			ball[i] = temp;
			// 중복데이터 검사
			for(int j = 0; j < i; j++) {
				if(ball[j] == temp) {
					i--;
					break;
				}
			}			
		} // for end
		// 정렬(오름차순)
		Arrays.sort(ball);
		
		System.out.print("이번 회차 로또 번호 : ");
		for(int k = 0; k < ball.length; k++) {
			System.out.print("[" + ball[k] + "]");
		}
		
	} // main() end

} // class end
