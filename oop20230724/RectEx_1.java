package oop20230724;

class Rect {//Rect 클래스"형"정의(자료형,틀)
	private int width;      //(정보은닉)외부접근 가능, 내부접근 가능
	private int height;     //(정보은닉)외부접근 가능, 내부접근 가능		
	
	public void setWidth(int w) {//setWidth 메서드 : width = 3;
		width = w; 		//width는 필드의 내부접근
	}
	public void setHeight(int h) {//setHeight 메서드 : heith = 5;
		height = h;
	}
	public int getWidth(){//getwidth 메서드; return 3;
		return width;	
	}
	public int getHeight(){//getHeight 메서드; return 5;
		return height;	
	}
	public int round() {
		return 2*(width+height);      //필드의 내부접근
	}
	int area() {
		return (width*height);		  //필드의 내부접근	
	}
}//Rect class end

public class RectEx_1 {		//실행클래스

	public static void main(String[] args) {
		int num = 10;
		
	// 클래스명 참조변수      클래스명(객체생성)
		Rect rect = new Rect();
		//rect.width = 3;  //(에러) private 멤버 : 외부접근 불가능
		rect.setWidth(3);   //public 멤버 : 외부접근 가능 
		//rect.height = 5; //(에러) private 멤버 : 외부접근 불가능
		rect.setHeight(5);	//public 멤버 : 외부접근 가능
		System.out.println("가로 길이 " + rect.getWidth() + "cm, 세로길이 " + rect.getHeight()+"cm");
		//rect.getwidth() = 10;//누군가 데이터를 수정했을떄 적용이되어 버린다.
		System.out.println("둘레는 " + rect.round() + "cm이고, 넓이는 " + rect.area() + "cm2 입니다." );
		rect.setWidth(10);
		rect.setWidth(10);
		System.out.println(rect.getWidth() + " " + rect.getHeight());

	}

}
