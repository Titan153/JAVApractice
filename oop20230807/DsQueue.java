package oop20230807;

interface Queue {
    boolean isEmpty();
    boolean isFull();
    void enqueue(char element);
    void dequeue();
    void peek();
    void clear();
}
public class DsQueue implements Queue {
    private int front;
    private int rear;
    private final int queueSize;
    private char[] arr;

    public DsQueue(int size) {
        front = -1;
        rear = -1;
        queueSize = size;
        arr = new char[queueSize];
    }

    @Override
    public boolean isEmpty() {
        if (front == rear) {
            front = -1;
            rear = -1;
        }
        return (front == rear);
    }

    @Override
    public boolean isFull() {
        return rear == (queueSize - 1);
    }

    @Override
    public void enqueue(char element) {
        if (isFull()) {
            System.out.println("큐가 꽉 찼어요!");
        } else {
            arr[++rear] = element;
            System.out.println("삽입된 요소 : " + element);
        }
    }

    @Override
    public void dequeue() {
        if (isEmpty()) {
            System.out.println("큐가 텅 비었어요!");
        } else {
            System.out.println("삭제된 아이템 : " + arr[front + 1]);
            front = (front + 1) % queueSize;
        }
    }

    @Override
    public void peek() {
        if (isEmpty()) {
            System.out.println("큐가 텅 비었어요!");
        } else {
            System.out.println("peek 된 요소 : " + arr[front + 1]);
        }
    }

    @Override
    public void clear() {
        if (isEmpty()) {
            System.out.println("큐가 텅 비었어요!");
        } else {
            front = -1;
            rear = -1;
            arr = new char[queueSize];
            System.out.println("큐가 비워졌어요!");
        }
    }

    public void printQueue() {
        if (isEmpty()) {
            System.out.println("큐가 텅 비었어요!");
        } else {
            System.out.print("큐 안의 요소들 : ");
            for (int i = front + 1; i <= rear; i++) {
                System.out.print(arr[i] + ", ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
    	DsQueue queue = new DsQueue(5);

        queue.enqueue('A');
        queue.printQueue();
        System.out.println();
        queue.enqueue('B');
        queue.printQueue();
        System.out.println();
        queue.enqueue('C');
        queue.printQueue();
        System.out.println();
        queue.enqueue('D');
        queue.printQueue();
        System.out.println();
        queue.enqueue('E');
        queue.printQueue();
        System.out.println();

        queue.dequeue();
        queue.printQueue();
        System.out.println();

        queue.dequeue();
        queue.printQueue();
        System.out.println();

        queue.dequeue();
        queue.printQueue();
        System.out.println();

        queue.dequeue();
        queue.printQueue();
        System.out.println();

        queue.peek();
        queue.printQueue();
        System.out.println();

        queue.clear();
        queue.printQueue();
    }
}