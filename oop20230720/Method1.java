package oop20230720;

public class Method1 {
	//필드 선언문 영역;
	//메서드 작성 영역, 메소드 정의 
	public static void testPrint(){
		System.out.println("Hello, java!"); //출력 기능
	}//return
	
	public static void main(String[] args)//메서드 헤더//JRE가 호출을 해서 main을 인식
	{//메소드 바디
		testPrint();//12번->6번~8번->12번//System.out.println("Hello, java!"); //출력 기능
	}//main()end //return
}//class()end
/*======메서드(Method): 멤버함수 ====
 *  1기능, 함수(function): 1기능, 모듈, 단위(unit)기능, procedure, 처리
 *  
 *  = 내장함수: 클래스.메소드() (예)Math.abc(-5)
 *           컴파일러 인식 0
 *           
 *  = 사용자정의함수(메소드): 컴파일러 인식x ---> o
 *             [step] 메소드 정의 ---> [step2]메소드 호출(call)
 * 1.메소드 정의
 *     접근제어자 반환형 메소드명(인수1, 인수2, ---여러개){ //메소드 헤더
 *         실행문1;                             //메소드 바디
 *         실행문2;
 *         return 반환값; //return문;
 *         
 *         }
 *         >인수(인자, argument, 매개변수, 파라미터, parameter)유무
 *         >반환값(리턴값, return value) 유무 : (무)반환값은 void형 일떄만 없다.
 *                                        (유)반환값은 1개. 
 * 2.메소드 호출(call)
 * 	   메소드명();
 *     메소드명(-5);  	
 *     메소드명(3,5);                 
 *     메소드명(a,b,c);
 *     r = 메소드명();
 *     r = 메소드명(3,5);
 *     System.out.println(메소드명());
 *     System.out.println(메소드명(3,5));
 *                      
 *                      
 *                      	 
 */
 