package oop20230710;

public class Operator5 {

	public static void main(String[] args) {
		//교재:74page
		//산술연산 기능의 단항연산자: ++, --, -
		//++: 증가 연산자, ++a, a++
		//--: 감소 연산자, --a, a--
		//                  증가               감소 
		//----------------------------------------
		//전위(앞, 먼저)        ++a              --a
		//후위(뒤, 나중)        a++              a--

		//a = a + 1;            a = a - 1;
		//a += 1;               a -= 1;
		//++a;                  --a;
		//a++;                  a--; 
		int a = 10;
	    int b = 0;
	    b = ++a;
	    //(1)a = a + 1;
	    //(2)b = a;
	    System.out.println("a: " + a); // (결과)11
	    System.out.println("b: " + b); // (결과)11
	    
	    a = 10;
	    b = 0;
	    b = a++;
	    //(1)b = a;
	    //(2)a = a + 1;
	    
	    System.out.println("a: " + a);//(결과)11
	    System.out.println("b: " + b);//(결과)10
	    
	}

}
