package oop20230726;

public class ExamTest {//실행클래스

	public static void main(String[] args) {
		//(stack)참조변수  (heap)객체생성
		//                 객체생성과 동시에 생성자 "자동호출"(최초 1번)
		Exam e1      =  new Exam();//동일한 패키지 안에있는 다른 클래스의 메서드 가져옴
		e1.disp();					//동일한 패키지 안에있는 다른 클래스의 메서드 가져옴
		//                  객체생성과 동시에 [매개변수]생성자 "자동호출"(최초 1번)    
		Exam e2      =  new Exam("홍길동");
		e2.disp();
		
		Exam e3 = new Exam(50, 60, 70);
		e3.disp();
		
		Exam e4 = new Exam("김철수", 90, 80, 60);
		e4.disp();
	}

}//ExamTest class end
