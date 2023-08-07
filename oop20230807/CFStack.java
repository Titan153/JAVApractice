package oop20230807;

import java.util.ArrayList;

class MyStack{
	private ArrayList<String> arrayStack = new ArrayList<String>();
	
	public void push(String data) {
		arrayStack.add(data);
	}
	
	public String pop() {
		int len = arrayStack.size();
		if(len == 0) {
			System.out.println("(언더플로우)스택이 비었습니다.");
			return null;
		}
		return arrayStack.remove(len-1); // 맨 뒤(위)의 자료를 반환하고 배열에서 제거
	}
}
public class CFStack {

	public static void main(String[] args) {
		
		MyStack stack = new MyStack();
		stack.push("A");
		stack.push("b");
		stack.push("C");
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		

	}

}
