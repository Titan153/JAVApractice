package oop20230724;

public class BookEx {//▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽필드(filed, property)▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽▽
		
	String title = "Java 프로그래밍";//멤버변수, 필드
	String author = "박철수";//
	int price = 25000;//
      
	public void show() {//메소드
		//메소드영역
		System.out.printf("%s 저자의 [%s]은 %d원 입니다.",author, title, price);
		//메소드영역
	    }//method()end

	
	public static void main(String[] args) {//메소드
		//메소드영역
		BookEx book = new BookEx();
		book.show();//show 메소드 호출
		//메소드영역
	}//method()end
}//BookEx class()end


