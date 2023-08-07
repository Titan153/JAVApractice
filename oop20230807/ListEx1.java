package oop20230807;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListEx1 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("lee");		//0
		System.out.println(list.size());
		list.clear();			//모두제거
		list.add("lee");		//0
		list.add("kim");		//1
		list.add("cho");		//2
		list.add("kang");		//3
		list.add("jung");		//4
		System.out.println(list.toString());
		System.out.println("ArrayList 사이즈 : " + list.size());
		System.out.println(list.contains("kim"));
		
		//list.remove("kim");//해당내용있는 인덱스를 제거
		list.remove(1);//해당 인덱스를 제거
		System.out.println(list.toString());
		System.out.println("ArrayList 사이즈 : " + list.size());
		System.out.println(list.contains("kim"));
		
		System.out.println("cho가 있는 인덱스(위치, 번째) : " + list.indexOf("cho"));// 1
		System.out.println("CHo가 있는 인덱스(위치, 번째) : " + list.indexOf("CHo"));//해당결과 없으면-1
		
		System.out.println("=배열을 이용하여 출력=");
		System.out.println(list.toString()); //ArrayList에서 0번째~마지막번째까지(전체요소) 출력
		//ArrayList에서 0번째부터(이상)~1번째까지(이하)(전체요소)출력 
		System.out.println(list.subList(0, 2));//0~2-1번째까지 출력
		List sublist = list.subList(1, 4);
		System.out.println(sublist);
		print(sublist);
	}//main()
	
	public static void print(List list) { //Iterator //반복자
		Iterator iter = list.iterator();
		while(iter.hasNext()) {
			String str = (String)iter.next();
			System.out.println(str);
		}
	}
	public static void print(Object[] obj) {
		int count = obj.length;
		for(int i = 0; i < count; i++) {
			System.out.println(obj[i]);
		}
	}

}//
