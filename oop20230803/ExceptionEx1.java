package oop20230803;

public class ExceptionEx1 {

	public static void main(String[] args) {
		//1)예외처리의 흐름
		System.out.println(1);
		System.out.println(2);
		
		try {
			
			System.out.println(2);
			System.out.println(3);
			System.out.println(3/0);   //예외 발생
		}catch(Exception eeeeee) {
			System.out.println(4);
		}
		System.out.println(5);

	}

}
