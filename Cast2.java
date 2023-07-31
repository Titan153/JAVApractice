package oop20230711;

public class Cast2 {

	public static void main(String[] args) {
		// 자동 형변환
		System.out.println((int)2.5);//2
		System.out.println(2.5 + 3.7);//6.2
		System.out.println((int)2.5     + (int)3.7);//
		//                int<-double     int<-double
		//                 2               3
		//                       5
		System.out.println((int)(2.5 + 3.7));  //6
		//                          6.2
		//                   int<-double
		
		//int형(4)과 char형(2)
		System.out.println((char)65); //'A'
		System.out.println((char)66);//'B'
		System.out.println((char)67);
		System.out.println((char)68);
		
		System.out.println((char)97); //'a'
		System.out.println((char)98);
		System.out.println((char)99);
		
		System.out.println((int)'A');
		System.out.println((int)'a');
		
		//uni코드 값과'문자'상수
		System.out.println('A'+1); //66,자동형 변환
		System.out.println((char)('A'+1));//'B'
		System.out.println((int)('A'+1));
		
		System.out.println("#" + (char)('a'-'A') + "#");
	
	
	}

}
