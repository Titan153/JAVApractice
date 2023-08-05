package oop20230803;

public class ExceptionEx4 {
	
	public static void main(String[] args) {
		//다중catch
		int[] n = new int[2];
		int num = 7;
		Integer su = null;		//null pointer : 숫자 0 아님, 문자' '(공문자) 아님
		try {
			n[7]= num;
			System.out.println(num / 0);  		//(예외)ArithmeticException
			System.out.println(num / su);			//(예외)NullPointerException
			//}catch(Exception e){
			//Exception 처리는 파생된 Exception 를 상속해준
			//최고 조상에 해당하는 Exception클래스가 받아서 처리해 주는 형태를 많이 사용한다.
			//여러 예외가 있지만, 외우기 힘드므로 최고 조상의 Exception만 사용해도 무방함.
		}catch(ArithmeticException e){				//Exception만써도 잘작동된다->Exception 이 최상위 클래스
			System.out.println(e.getMessage());
		}catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("다중 catch 절로 예외를 잘 핸들링하였습니다.");
		}
		System.out.println("프로그램 정상 종료");
	}//main()end

}//class()end
