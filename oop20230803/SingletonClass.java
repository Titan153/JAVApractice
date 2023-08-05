package oop20230803;


class MySingletonClass{
	private static MySingletonClass single_instance = null;; //필드
	private MySingletonClass() {}//기본 생성자 //외부에서 접근못하도록 private로 차단
	
	public static MySingletonClass getInstance() { //메서드 //외부 연결용 public으로 메서드 하나만 둔다
		if(single_instance == null) {
		single_instance = new MySingletonClass();
		}
		return single_instance;
	}
	
	
}


public class SingletonClass {

	public static void main(String[] args) {
		//싱클톤 클래스 작성하는 방법(싱글톤 패턴, 단일객체)
		//1.생성자를 private로 생성
		//2.싱글톤 클래스의 반환형으로 static(정적)메소드 지정
		MySingletonClass singleton1 = MySingletonClass.getInstance();
		System.out.println(singleton1);
		System.out.println(singleton1.toString());
		
		MySingletonClass singleton2 = MySingletonClass.getInstance();
		System.out.println(singleton2);
		System.out.println(singleton2.toString());
		
		MySingletonClass singleton3 = MySingletonClass.getInstance();
		System.out.println(singleton3);
		System.out.println(singleton3.toString());
		

	}//main() end

}//class() end
