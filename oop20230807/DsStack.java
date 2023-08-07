package oop20230807;

public class DsStack {

    // 스택의 요소를 저장할 int[]
    private int[] arr;
    // 스택의 맨 위
    private int top;
    // 스택의 총 용량
    private int capacity;

    DsStack(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    // 요소를 스택의 맨 위에 추가
    public void push(int element) {
        if (isFull()) {
            System.out.println("스택이 꽉 찼어요!");
            System.exit(1);
        } else {
            System.out.println("삽입 : " + element);
            System.out.println("push() 호출 후 추가되는 숫자 : " + element);
            // top++로 하면 ArrayIndexOutOfBoundsException 에러가 발생한다
            arr[++top] = element;
        }
    }

    // 스택 안의 맨 마지막 값을 제거하는 메서드
    public int pop() {
        if (isEmpty()) {
            System.out.println("스택이 텅 비었어요!");
            System.exit(1);
        }

        return arr[top--];
    }

    // 스택이 꽉 찬 상태인지 확인해 T/F를 리턴하는 메서드
    public Boolean isFull() {
        return top == capacity - 1;
    }

    // 스택이 비어있는 상태인지 확인해 T/F를 리턴하는 메서드
    public Boolean isEmpty() {
        return top == -1;
    }

    // 스택의 크기를 구하는 메서드
    public int getSize() {
        return top + 1;
    }

    // 마지막 요소를 확인하는 메서드
    public int peek() {
        if (!isEmpty())
            return arr[top];
        else
            System.exit(1);
        return -1;
    }

    // 스택 안의 요소들을 출력하는 메서드
    public void printStack() {
        for (int i = 0; i <= top; i++)
            System.out.print(arr[i] + " ");
    }

    public static void main(String[] args) {

    	DsStack stack = new DsStack(5);

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.print("마지막에 담긴 요소 : " + stack.peek());
        System.out.println();
        System.out.print("스택 안의 모든 요소 출력 : ");
        stack.printStack();
        System.out.println("\n스택의 크기 : " + stack.getSize());

        System.out.println("============================================================");
        stack.pop();
        System.out.println("\n삭제 후...");
        stack.printStack();
        System.out.println("\n스택의 크기 : " + stack.getSize());
    }

}