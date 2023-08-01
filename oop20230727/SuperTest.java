package oop20230727;

class Parent {
	int i,j;
	public Parent() {
		
	}
	public Parent(int i, int j) {
		this.i=i;
		this.j=j;
	}
}
class Child extends Parent {
	int k;
	public Child() {
		super(); 			//부모클래스 기본생성자 호출
	}
	public Child(int ii, int jj, int kk) {
//		this.i = i;
//		this.j = j;
		super(ii,jj); //부모클래스 매개변수생성자 호출
		this.k = kk;
	}
}

public class SuperTest {

	public static void main(String[] args) {
		//Parent()생성자 -> child()생성자 호출
		Child child1 = new Child();
		
		Child child2 = new Child(4, 5, 6);
		System.out.println(child2.i);
		System.out.println(child2.j);
		System.out.println(child2.k);

	}//main()end

}//class()end
