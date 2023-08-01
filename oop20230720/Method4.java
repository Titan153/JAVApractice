package oop20230720;

public class Method4 {
	//add(int x,int y)메서드 기능 : 두개의 정수 매개변수를 전달받아 덧셈 연산 후 결과를 반환
	public static int add(int x,int y) {
		return(x + y);
	}
	public static int min(int x,int y) {
		return(x - y);
	}
	public static int mul(int x, int y) {
		return(x * y);
	}
	public static int div(int x, int y) {
		if(y==0) {
			System.out.println("나누는 수는 0이 될 수 없습니다.");
			return -999;
		}else {
			return(x/y);
		}
	}
	
	public static void main(String[] args) {
		int num1 = 20;
		int num2 = 30;
		//int num3 = num1 + num2;
		int num3 = add(num1, num2);
		int num4 = min(num1, num2);
		int num5 = mul(num1, num2);
		int num6 = div(num1, num2);
		
		System.out.println( (num1 + num2) );
		System.out.println( num3 );
		//System.out.println( add(num1,num2) );
		System.out.println(num1 + "+"+ num2 + "="+num3);
		System.out.println(num1 + "-"+ num2 + "="+num4);
		System.out.println(num1 + "*"+ num2 + "="+num5);
		System.out.println(num1 + "/"+ num2 + "="+num6);
			
	
	}//main()end

}
