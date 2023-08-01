package oop20230725;

class Calculator{
	
	int num1;
	int num2;
	
	public void add(int a,int b) {
		System.out.println(a + " + " + b + " = " + (a+b));
	}
	public void min(int a,int b) {
		System.out.println(a + " - " + b + " = " + (a-b));
	}
	public void mul(int a,int b) {
		System.out.println(a + " * " + b + " = " + (a*b));
	}
	public void div(int a,int b) {
		System.out.println(a + " / " + b + " = " + (a/b));
	}
	
}

public class CalculatorEx {

	public static void main(String[] args) {
		// 클래스명(파일명) : CalculatorEx.java
		// Calculator 클래스를 정의하시오.
		// 필드 : 첫번째 피연산자 num1
		// 필드 : 두번째 피연산자 num2
		// 메소드 : 덧셈 후 반환하는 add 메소드
		// 메소드 : 뺄셈 후 반환하는 min 메소드
		// 메소드 : 곱셈 후 반환하는 mul 메소드
		// 메소드 : 나눗셈 후 반환하는 div 메소드
		//[결과]
		//5 + 3 = 8
		//5 - 3 = 2
		//5 * 3 = 15
		//5 / 3 = 1
		Calculator c = new Calculator();
		c.num1=5;
		c.num2=3;
		c.add(5, 3);
		c.min(5, 3);
		c.mul(5, 3);
		c.div(5, 3);
		
		
		

	}

}
