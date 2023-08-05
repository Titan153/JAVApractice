package oop20230803;
class Test{
	/*
	void view() {
		
		try {
			int a = 3 / 0;
		}catch (Exception e) {System.out.println(e.toString());}
		
	}
	void disp() {
		try {
			Integer in = null;
			int a = in.intValue();
		} catch (Exception e) {System.out.println(e.toString());}
	}
	*/
	void view()throws Exception{
		int a = 3 / 0;
	}
	void disp()throws Exception {
		Integer in = null;
		int a = in.intValue();
	}
}//class()end
public class ExceptionEx6 {

	public static void main(String[] args) {
		//throws 문
		//메소드에 예외 선언 함께 사용
		Test test = new Test();
		/*1)
		test.view();
		test.disp();
		*/
		System.out.println("START");
		try {
			//test.view();
			test.disp();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("END");
		}
		
		
		
	}//main() end

}
