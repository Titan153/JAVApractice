package oop20230706;

public class VariableEx5 {

	public static void main(String[] args) {
		// 문자형 변수
		char var = 'a';
		System.out.println(var);   //(결과)a
		System.out.println((int)var); //결과97
		System.out.println('A');
		System.out.println((int)'A'); //대문자 A를 정수로표현하여 유니코드 값이 나옴
		char var1 = '\u0041';//유니코드 16진수값으로 표현한 것이다
		System.out.println(var1);
		System.out.println();
		System.out.println((int)'E');
		System.out.println((int)'가');
		System.out.println((int)'1');
		System.out.println((int)' ');
		System.out.println();
		System.out.println('a' - 'A');//(결과) 32
		System.out.println('b' - 'B');
		System.out.println((int)'→');



	}

}


/*=== chr형
 * 1. (java) Uni코드 : 2byte(16bit)
 *           'A'(65) 00000000 01000001 아스키코드에서 덪붙임
 *           'a'(97) 00000000 01100001
 *  
 * 
 * 
 * 2. (C언어) ASCII(American standard code for information interchange)코드 : 1byte(8bit)
 *            1byte - > char형 ('0+7bit')
 *            'A'(65) 1000001
 *            'a'(97) 1100001
 * 
 */

