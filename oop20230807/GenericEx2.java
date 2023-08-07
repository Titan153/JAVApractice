package oop20230807;
//자료형 매개변수를 두개 사용하는 클래스
class Point<T,V>{
	T x;  //필드 : x좌표
	V y;  //필드 : y좌표
	
	public Point(T x, V y) {
		super();
		this.x = x;
		this.y = y;
	}
	public T getX() {
		return x;
	}
	public void setX(T x) {
		this.x = x;
	}
	public V getY() {
		return y;
	}
	public void setY(V y) {
		this.y = y;
	}
	
}

public class GenericEx2 {

	public static <T,V> double makeRectangle(Point<T,V> p1, Point<T,V>p2) {
		
		double left = ((Number)p1.getX()).doubleValue();
		double right = ((Number)p2.getX()).doubleValue();
		double top = ((Number)p1.getY()).doubleValue();
		double bottom =((Number)p2.getY()).doubleValue();
		
		double width = right - left;
		double height = bottom - top;
		
		return width * height;
	}//makeRectangle()end
	public static void main(String[] args) {
		Point<Integer, Double>p1 = new Point<Integer, Double>(0, 0.0);
		Point<Integer, Double>p2 = new Point<>(10, 10.0);
		
		double rect = GenericEx2.<Integer,Double>makeRectangle(p1, p2);
		System.out.println("사각형의 넓이 : "+rect);
		

	}

}
