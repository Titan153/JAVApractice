package oop20230807;

import java.io.IOException;

public class InoutOuput {

	public static void main(String[] args) throws IOException {
		//키보드(표준입력장치)-(바이트)-> to메모리(변수)
		//			System.in
		//모니터(표준출력장치)<-(바이트)- from메모리(변수)
		//			      System.out
		
		//키보드로 소문자 한개를 입력받아
		//모니터로 대문자로 변환하여 출력하기
		int data = 0;
		data = System.in.read();
		
		System.out.println(data);
		System.out.println((char)(data-32));
		

	}

}
