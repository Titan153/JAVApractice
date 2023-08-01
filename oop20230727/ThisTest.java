package oop20230727;

class Video extends Object{
	public Video() {}
	public Video(int x) {
		System.out.println("Video 매개변수 생성자");
	}
}
class Movie extends Video {
	public Movie() {
		System.out.println("Movie 생성자");
	}
}
class Action extends Movie{
	public Action() {
		System.out.println("Action 생성자");
	}
	public Action(String name) {
		System.out.println("액션영화제목 : " + name);
	}
}
class ThisData{
	int i;
	int j;
	int k;
	public ThisData() {
		this(4, 5, 6);
	}
	public ThisData(int i, int j, int k) {
		this((i+j+k)/3);
		this.i = i;
		this.j = j;
		this.k = k;
	}
	public ThisData(int r) {
		for(int n = 1; n <= r; n++) {
			System.out.print("*");
		}
	}
}//class end
class SubThisData extends ThisData {
	
}//class end

public class ThisTest {

	public static void main(String[] args) {
		Video vd = new Video();      //Object()생성자 -> Video() 생성자
		Movie movie = new Movie();	 //Video()생성자  -> Movie()생성자
		Action act1 = new Action();  //Video()생성자  -> Movie()생성자 -> Movie()생성자
									 //Video()생성자  -> Movie()생성자 -> Movie(매개변수)생성자			
		Action act2 = new Action("미션파서블");  //
		//[상속 관계]의 자식 객체는 부모 객체의 생성자를 먼저 자동실행한다.
		//ThisData()생성자 -> SubThisData()생성자(컴파일러 추가)
		SubThisData sub = new SubThisData();
		//결과 *****

	}

}
