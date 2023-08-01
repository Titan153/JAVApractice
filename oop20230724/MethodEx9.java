package oop20230724;

public class MethodEx9 {
	
	public static int factoral(int n) {
		//5! -> 5*4*3*2*1
		//n! -> (n-1)*(n-1-1)*----*1
		if(n<=1)//재귀호출 사용시, "반드시" 종료조건(판별)	
		 return 1;
		return n*factoral(n-1);//factoral(n-1)을 통해 안에 다시들어가는 4,3,2는 매개변수기떄문에 원본 n 5값을 바꾸지않는다
	}
	    
	public static void main(String[] args) {
		// 팩토리얼 5!을 계산하여 출력하는 프로그램
		// 5! -> 5 * 4 * 3 * 2 * 1
		//[결과] 5! = 120
		int num = 5; 
		System.out.println(num + "! = " + factoral(5));

	}

}//class()end
/*#재귀호출 메서드(함수)(recursion function)
 * :자기 자신을 다시 호출하여 작업을 수행하는 함수
 *#재귀호출 함수의 예 : 문자열 회문 판별, 퀵 정렬(qick sort)
 * 재귀호출함수의 장단점
 * (+)복잡한 알고리즘을 간단히 해결 가능
 * (+)변수사용 최소화 가능
 * (+)코드의 간결성 : while문이나 for문 같은 반복문을 사용하지 않아도 되기 떄문
 * (-)많은 메모리(process stack)사용 (스택오버플로우), 속도저하
 * (-)함수 호출 -> 복귀를 위한 문맥 교환(컨텍스트 스위칭)에 비용이 발생
 * (해결)꼬리 재귀(tail call recursion)= TCo(Tail Call Opimization)
 *  
 */
