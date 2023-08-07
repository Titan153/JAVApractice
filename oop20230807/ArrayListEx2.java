package oop20230807;
//Scanner class 로부터 console에서 이름(String)을 입력받아
//ArrayList에 저장하고 출력

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ArrayListEx2 {

	public static void main(String[] args) {
		List<String> a = new ArrayList<String>();
		
		Scanner input = new Scanner(System.in);
		for(int i = 0; i<3;i++) {
			System.out.print("이름입력: ");
			String name = input.next();
			a.add(name);
		}
		//전통 for문으로 "인덱스 순으로" "전체요소" 출력
		for(int i = 0; i < a.size(); i++) {
			String name = a.get(i);
			System.out.println(name);
		}
		//향상 for문으로 "순서대로""전체요소"출력
		for(String name: a) {
			System.out.println(name);
		}
		//결과적 List에서도 Set에서도 사용 가능
		Iterator<String> it = a.iterator();
		while(it.hasNext()) {//다음 요소 존재하는지 판별(true,false)
			String name = it.next(); //다음 요소값을 반환(iterator->String)
			System.out.println(name);
		}
		
		
	}

}
