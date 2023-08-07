package oop20230807;

import java.util.ArrayList;
import java.util.Iterator;

class Mountain{
	String name; //산이름
	int height;	 //산높이
	public Mountain() {
		super();
	}
	public Mountain(String name, int height) {
		super();
		this.name=name;
		this.height=height;
	}
}
public class GenericEx {
	public static void main(String[] args) {
		
		ArrayList<String>ls = new ArrayList<>();
		ls.add("seoul");
		ls.add("jeju");
		//ls.add(3);
		//ls.add(new lnteger(3));
		
		Mountain one = new Mountain("한라산", 1950);
		Mountain two = new Mountain("북한산", 1500);
		Mountain three = new Mountain("설악산", 1230);
		
		ArrayList<Mountain>mlist = new ArrayList<Mountain>();
		mlist.add(one);
		mlist.add(three);
		mlist.add(two);
		
		//1)
		for(int i = 0; i < mlist.size();i++) {
			Object obj = mlist.get(i);
			Mountain dto = (Mountain)obj;
			System.out.println(dto.name + " : " + dto.height);
		}
		//2
		Iterator<Mountain> iter = mlist.iterator();
		while(iter.hasNext()) {
			Mountain dto = iter.next();
			System.out.println(dto.name + " : " + dto.height);
		}
	
	}
}
/* ===제네릭(스),generics ===
 * - 자료형(data type)을 일반화(generalize)하는것
 * - 객체를 저장하는 기술인 컬렉션 프레임워크를 개선한 기능
 * - E element(원소) --> 클래스만 가능
 */
