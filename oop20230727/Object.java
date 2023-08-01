package oop20230727;

import java.util.*;

public class Object {

	public static void main(String[] args) {
		Object object = new Object();
		System.out.println(object.toString());//object 의 주소를 나타내주고

		String[] a = {"str","kor", "eng"};
		System.out.println(Arrays.toString(a));//a 안에있는 각원소의 주소를 프린트하지 않고 값을 프린트해준다(오버라이딩)
											   //왜냐하면 오브젝트는 최상위 클래스 이기때문에 Arrays가 상속을 받아서
	}

}
