package oop20230710;

public class Operator1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*연산자(Operator):연산기능을 하는 기호
 *     피연산자(Operland, 연산의 대상,항)의 갯수 
 * 1. 단항 연산자-->!,~,++,--
 * 2. 이항 연산자-->+,-,*,/,&&,||,^,&,%,=
 * 3. 삼항 연산자-->항1? 항2: 항3
 * 
 * 대입연산자(=)
 * L-valye = R-value;
 *   주소		   값
 *   
 *   int i = 10;
 *   int k = 20;
 *   
 *   i = i + 1;
 *  
 */
		int i = 10;
		int j = 20;
		
		//복합연산자 : +=, -=, *=, /=, %=, <<=, >>=, &=, ^=, !=
		//i = i + 1;
		i += 1; //복합연산자: =+
		//i = i - 1;
		i -=1; //복합연산자: -=
		
		System.out.println(i);

		i += j; //i = i + j;
		System.out.println("i += j; i 출력 ->" + i);
		i -= j; //i = i - j;
		System.out.println("i -= j; j 출력 ->" + j);
		
		
	/* 이항연산자 우선순위
	 *                 비트 쉬프트 연산자              비트 논리 연산자
	 *                 <<,>>,>>>                  &→^→|
	 * 
	 *                             [결과]논리값: true/false      [결과]논리값: true/false
	 * (괄호) -----> 산술 연산자 ----------> 관계(조건) 연산자   ----------> 논리연산자
	 *                                                           NOT->AND->OR
	 *  5  /  2  ->  2                5 > 2 -> true,참,Yes,O     논리부정 논리곱 논리합
	 * int   int    int               5 < 2 -> false,거짓,no,X      !    &&   ||
	 *                                5 ==2 -> false              5  && 2-> true
	 * 5.0 / 2.0 -> 2.5               5 !=2 -> true              true  true
	 * double double double                                       5  && 0 -> false
	 * 5.0  / 2  -> 2.5                                          true  false  
	 * double int   double                               (gender == 1) && (age ==20)  
	 *        ->2.0 double 로 컴파일러가 바꿔줌(형변환)
	 * 
	 * 나머지 연산자       
	 * 5%2-> 1      
	 * 
	 */
	}

}
