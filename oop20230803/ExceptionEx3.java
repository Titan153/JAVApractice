package oop20230803;

public class ExceptionEx3 {

	public static void main(String[] args) {
		try {
		int[] num = new int[3];
		for(int i = 0; i <= 3; i++) {
			num[i] = i*2; //(예외 발생)ArrayIndexOutOfBoundsException
			//num[3]=6;
			System.out.println("-----");
		}
		}catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("배열의 크기를 넘어서는 인덱스입니다.");
//			예외 확인 메서드(3가지)
			System.out.println(e);
			System.out.println(e.toString());
			System.out.println(e.getMessage());
			e.printStackTrace();
		}finally {
			System.out.println("END");
		}
		

	}

}
