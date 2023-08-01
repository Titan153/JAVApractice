package oop20230725;

class ABC{//클래스 정의
	
	private int x;
	private int y;
	private int z;
	
	public int getX() {
		return this.x;
	}
	public void setX(int x) {
		//자기자신필드 = 매개변수;
		this.x = x;
	}
	public int getY() {
		return this.y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getZ() {
		return this.z;
	}
	public void setZ(int z) {
		this.z = z;
	}
	//this : 자기 자신을 가르치는 참조변수
}

public class GetterSetter {

	public static void main(String[] args) {//실행 클래스
		ABC a = new ABC();
		a.setX(10);
		System.out.println(a.getX());

	}

}
