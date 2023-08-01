package oop20230725;

class TestInit {   //클래스{ ptivate 필드 + 메서드 + public 메서드(setter,getter)}
	//1.필드(멤버변수)
	private int a;
	private double b;
	//2.생성자(메서드),constructor
	public TestInit() {	
		//기본(default)생성자 메서드
	}
	//3.메서드(멤버 함수)
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public double getB() {
		return b;
	}
	public void setB(double b) {
		this.b = b;
	}
	public void set(int a, double b) {
		this.a=a;
		this.b=b;
	}
	public void show() {
		System.out.println("a:" + a + ",b:" + b );}
	public void init(){// 초기화 설정	
		a = 0;
		b = 0.0;
		}
}//TestInit class end

public class ClassTest2 {//실행 클래스

	public static void main(String[] args) {
		int a = 10;    //초기화
		a= 70;         //대입(설정, set)
		a=100;			
		
		//               객체생성과 "동시에"      필드 초기화
		//      참조변수    객체생성 "직후,"->생성자"메서드" 호출
		TestInit t1 = new TestInit();
		t1.init();
		t1.show();
		t1.set(10, 3.14);
		t1.show();
		t1.setB(5.5);
		t1.show();
		t1.set(1,1.1);
		t1.show();
		

	}

}
