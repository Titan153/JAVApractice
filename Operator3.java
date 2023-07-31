package oop20230710;

public class Operator3 {

	public static void main(String[] args) {
		// 관계(조건)연산자: 선택문, 반복문 ==> 조건식(판별식)
		int i = 5;
		int j = 2;
		System.out.println("5 == 2:" + (i==j)); //(결과) false
		System.out.println("5 != 2:" + (i!=j)); //(결과) true
		System.out.println("5 < 2:" + (i<j));//(결과)false <미만
		System.out.println("5 > 2:" + (i>j));//(결과)false >초과
		System.out.println("5>= 2:" + (i>=j));//(결과)true >=이상
		System.out.println("5<= 2:" + (i<=j));//(결과)false<=이하
		System.out.println(10+5<20+10);//(결과)true
		//10+5<20+10
		//(10+5)<(20+10)
		//15<30
	}

}
