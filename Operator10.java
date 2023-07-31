package oop20230711;

public class Operator10 {

	public static void main(String[] args) {
		// 삼항연산자(조건연산자): if~else
		//[문법] 항1 ? 항2 : 항3
		//[문법] 조건식 ? true값 : false값
        //[문법] 조건신1 ? true값 : 조건식 2 ? true값 : false값
		//선언,입력
		int num = -1;
		//(결과)2가지 중 1가지 결과 : "양수(0포함)" 또는 "음수"
		String result = "";
		//처리
		//항1 ? 항2 : 항3
		//result = (num >= 0) ? "양수(0포함)" : "음수"; 
		
		
		//(결과)3가지 중 1가지 결과 : "양수" 또는 "0" 또는 "음수";
		result = (num > 0) ? "양수": (num == 0) ? "0":"음수";
		
		
		
		//출력
		
		
		System.out.println(result);
	}

}
