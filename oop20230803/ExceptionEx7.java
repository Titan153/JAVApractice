package oop20230803;
//사용자 정의 예외 "클래스" 정의
import java.util.Scanner;

class AgeInputException extends Exception{
	public AgeInputException() {
		//Exception 클래스의 생성자 호출("문자열"전달)---> getMessage() 반환됨
		super("유효하지 않은 나이가 입력되었습니다.");
	}
}

public class ExceptionEx7 {
	public static int readAge() throws AgeInputException{
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		if(age < 0) {
			AgeInputException excpt = new AgeInputException();
			throw excpt;
		}
		return age;
	}
	public static void main(String[] args) {
		System.out.println("나이를 입력하세요 : ");
		try {
			int age = readAge();
			System.out.println("당신의 나이는 " + age + "세 이군요!");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
