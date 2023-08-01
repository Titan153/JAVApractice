package oop20230720;

public class Method5 {
	//(1)두 정수 초기화 ->(2)덧셈 ->(3)출력 
	//[callee]                                       [caller] 
	//add1 메소드 기능 : 없음                           / main 메소드 기능 : 두정수를 초기화하고 덧셈 후 출력
	//add2 메소드 기능 : 두 정수를 초기화 하고 덧셈 후 출력      / main 메소드 기능 : 없음
	//add3 메소드 기능 : 두 정수를 초기화 하고 덧셈            / main 메소드 기능 : 출력
	//add4 메소드 기능 :(두 정수를 전달 받아서) 덧셈 후 출력     / main 메소드 기능 : 두 정수 초기화
	//add5 메소드 기능 : (두 정수를 전달 받아서) 덧셈 (결과 반환) / main()메서드 기능 : 두 정수 초기화,(전달)출력
//	                  가인수  int x = 20; int y = 30;
	public static int add(int x, int y) { // 변수x,y : 지역변수
		return x + y;
	} //변수 x,y 소멸(제거)
	public static void main(String[] args) {
	    //선언, 초기화, 입력
		int num1 = 20;
		int num2 = 30;
		int num3;
		// 처리
		num3 = add(num1,num2);//add(20,30) <-Call by Value
		//출력
		System.out.println(num1 + "" + num2 + "=" + num3);
		
	}//main()end
	
}//class()end
/*===함수(메서드)호출===
 * 
 *[Caller]                 [Callee]  
 * 
 *     실매개변수                          가매개변수
 *      실인수                            가인수
 * main(){                 add(int x, int y){
 * 
 * add(a,b); ---[Call]--->
 *           <--[RETURN]--    return문;  
 * }                        }
 *===Java 매개변수 전달 기법(십인수--->가인수)
 *1.Call by Value(값에 의한 전달)
 *  : 값, 복사, 원본->사본	return문; (1개반 결과반환)
 *2.Call by Reference, Address (참조/ 주소에 의한 전달)
 *  : 주소, 원본값에 반영(처리)      
 */
 
