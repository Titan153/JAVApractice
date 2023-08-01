package oop20230720;

public class Method8 {

	public static int add(int n, int m) {
		return n + m;
	}
	public static double add(double n, double m) {//메서드 오버로딩
		return n + m;
	}
	public static char add(char n, char m) {//메서드 오버로딩
		return (char)(n + m);
	}
	public static String add(String n, String m) {//메서드 오버로딩
		return n + m;  //+ : 문자열 연결연산자
	}
	public static void main(String[] args) {
		int    r1 = add(10, 20);             //두 정수의 덧셈
		double r2 = add(1.1, 2.2);		//두 실수의 덧셈	
		char   r3 = add('1', 'A');		            //두 문자의 덧셈
		String r4 = add("Method", "Overloading");   //두 문자열의 덧셈
		
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4);
	}//main()end

}//class()end
/*==="메서드 오버로딩(method overloading)"===
 * - 메서드 중복 정의
 * -(한 클래스 "내"에서)
 * -메서드명은 같고,
 *  매개변수의 갯수 또는 자료형이 다른경우
 * 
 * 
*/