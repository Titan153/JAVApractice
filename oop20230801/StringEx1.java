package oop20230801;

public class StringEx1 {

	public static void main(String[] args) {
		// 클래스명(파일명) : StringEx1.java
		// (문제) 10명의 친구 문자열 String[]에서 abc 순서로 sorting(정렬)하는 프로그램
		// 선택정렬(오름차순)
		// String[] friends = { "Jack", "John", "Aman", "Brute", "Hank", "Canny", "Lee", "Louis", "June", "Frank" };
		// [HINT] String 클래스의 compareTo() 메서드 사용
		String[] friends = { "Jack", "John", "Aman", "Brute", "Hank", "Canny", "Lee", "Louis", "June", "Frank"};
	
		for(int i = 0; i < friends.length-1; i++) {
			for(int j = i+1; j<friends.length;j++) {
				if(friends[i].compareTo(friends[j]) > 0) {
					
					String temp = friends[i];
					friends[i] = friends[j];
					friends[j] = temp;
					
					
				}//if end
			}//for j end
		}//for i end
		
		for(String name : friends) {
			System.out.print(name + " ");
		}
	}

	private static int compareTo(String string) {
		
		return 0;
	}//main end

}//class end
