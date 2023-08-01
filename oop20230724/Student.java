package oop20230724;

public class Student {
	//1.필드(field)선언부
	String name;	//필드 : 이름
	int score;	//필드 : 점수
	//2.생성자(생성메서드)(constructor)선언부
	//3.메서드(method)선언부
	public void setName() {//기능 : 이름필드 대입
		name = "";
	}
	public void setScore() {//기능 : 성적필드 대입
		score = 0;
	}
	
	public static void main(String[] args) {
		//클래스는 "참조형"자료형이다!!
		//[문법]
		//클래스명 참조변수명 = new 클래스명();
		Student hong = new Student();//객체 생성
		hong.name="홍길동";
		System.out.println(hong.name);
		hong.score = 100;
		System.out.println(hong.score);
		
		Student kim = new Student();
		kim.name = "김철수";
		kim.score = 60;
		System.out.println(kim.name + "학생의 점수는"+kim.score+"점 입니다.");
		

	}//main()end

}//class()end
