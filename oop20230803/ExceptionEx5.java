package oop20230803;

public class ExceptionEx5 {
	
	public static void main(String[] args) {
		Integer inte = null;
		int i = 3;
		
		try {
			if(i%2==0) {
				inte=new Integer(i);//짝수일 경우만 객체 생성
				
			}
			if(inte == null) {
				System.out.println("객체가 생성되지 않았습니다.");
			}else {
				System.out.println(inte.hashCode());
			}
			System.out.println("10진수 : " + inte.intValue());
			System.out.println("2진수 : " + inte.toBinaryString(i));
			System.out.println("8진수 : " + inte.toOctalString(i));
			System.out.println("16진수 : " + inte.toHexString(i));
		}catch(NullPointerException e) {
			System.out.println("객체를 만드세요.");
			System.out.println(e.toString());
		}finally{
			System.out.println("-----------------");
			System.out.println("예외 처리(핸들링) 끝내고, finally 블록을 수행하였습니다.");
		}
	}
}
