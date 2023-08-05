package oop20230803;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.Vector;

public class ListEx1 {

	public static void main(String[] args) {
	     Vector vec = new Vector();
	     System.out.println(vec.size());//요소(components)의 갯수
	     vec.add(3);
	     vec.add(3.14);
	     vec.add("HAPPY");
	     vec.add('k');
	     vec.add(3);
	     System.out.println(vec.size());
	     vec.add(new Integer(5));
	     vec.add(new Double(3.5));
	     System.out.println(vec.size());
	     System.out.println("---");
	     for(int i = 0; i < vec.size(); i++) {
	    	 System.out.println(vec.get(i));
	     }
	     System.out.println("---");
	     System.out.println(vec.get(3));
	     vec.removeAllElements();
	     System.out.println(vec.size());
	     System.out.println("---");
	     
	     if(vec.isEmpty()) {
	    	 System.out.println("비어있음");
	     }else {
	    	 System.out.println("채워있음");
	     }
	     System.out.println("---");
	     
	     Set set = new HashSet();
	     set.add(3);
	     set.add(3.14);
	     set.add("Happy");
	     set.add('k');
	     set.add(new Integer(5));
	     set.add(new Double(3.5));
	     set.add(new String("Java"));
	     System.out.println(set.size());
	     set.add(3);		//실행 안함(불가능)
	     System.out.println(set.size());
	     HashMap map = new HashMap();
	     map.put("one", 3);
	     map.put("two",3.14);
	     map.put("three", "HAPPY");
	     map.put("four", new Integer(5));
	     map.put("five", 3);
	     map.put("five", 5); //실행 안함("key" 중복 불가능) --> 기존 값 인정안함
	     
	     System.out.println(map.size());
	     System.out.println(map.get("two"));
	     System.out.println(map.get("five"));//키값에 중복을 인정하지 않지만 실행했을떄는 "5"는 나타남
	     
	     HashSet hs = new HashSet();
	     hs.add(3);
	     hs.add(3.14);
	     hs.add("soul");
	     hs.add('B');
	     hs.add(new Integer(5));
	     
	     
	     java.util.Iterator iter = hs.iterator();
	     System.out.println("---");
	     while(iter.hasNext()== true) {//가르키는 "커서"가 존재하니?
	    	 Object obj = iter.next();//"커서"가 가르키는 요소를 (일반형 객체로) 가져오기
	    	 System.out.println(obj.toString());
	     }
	     
	}

}


/*
 * === java Collection Framwork====
 * -객체들을 효율적으로 추가, 삭제, 검색할 수 있도록 제공된 컬렉션 라이브러리
 * -배열(array)의 단점을 개선한 클래스, 객체만 저장할 수 있다.
 * -java.util.*
 * 1.List : 순서 존재, 중복 허용
 * 			List, Vector, ArrayList, Iterator 
 * 2.Set : 순서 없음, 중복 허용 안함
 * 			Set, HashSet
 * 3.Map : 순서 없음
 *         key, value 쌍으로 이루어져 있음
 *         -key 중복 허용 안함
 *         -value 중복 허용 
 * 			Map, HashMap, HashTable
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */