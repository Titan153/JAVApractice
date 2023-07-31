package oop20230711;

public class Cast1 {

	public static void main(String[] args) {
		// 자동 형 변환
		int a = 3;
		long b = a;
		System.out.println(a + "" + b);
		System.out.println();
		
		float c = 2.4f;
		double d = c;
		System.out.println(c + " " + d );
		System.out.println();
		
		int e = 5;
		//byte f = e; //에러
		
		System.out.println(3/5);
		System.out.println(3/5.0);//자동 형 변환
		System.out.println(3.0/5);//자동 형 변환
		System.out.println(3.0/5.0);
		

	}

}
