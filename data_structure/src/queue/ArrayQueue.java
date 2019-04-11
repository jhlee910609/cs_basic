package queue;

import queue.Queue;

public class ArrayQueue implements Queue {

    private int front, rear;
    private char[] itemArray;
    private int size;

    public ArrayQueue(int size) {
        this.front = -1;
        this.rear = -1;
        this.size = size;
        itemArray = new char[size];
    }

    @Override
    public boolean isEmpty() {
        return front == rear;
    }

    public boolean isFull() {
        return rear == size - 1;
    }

    @Override
    public void enqueue(char item) {
        if (!isFull()) {
            itemArray[++rear] = item;
        }
    }

    @Override
    public char dequeue() {
        return isEmpty() ? 0 : itemArray[++front];
    }

    @Override
    public void delete() {
        if (!isEmpty()) {
            ++front;
        }
    }

    @Override
    public char peek() {
        // 없음을 -1로 표현했기 때문에 ㅇㅇ
        return isEmpty() ? 0 : itemArray[front + 1];
    }
}
