package queue;

public class ArrayCQueue implements Queue {

    int front, rear;
    int size;
    char[] itemArray;

    public ArrayCQueue(int size) {
        this.size = size;
        itemArray = new char[size];
        front = 0;
        rear = 0;
    }

    @Override
    public boolean isEmpty() {
        return (front == rear);
    }

    public boolean isFull() {
        return (rear + 1) % size == front;
    }

    @Override
    public void enqueue(char item) {
        if (!isFull()) {
            int temp = (rear + 1) % size;
            itemArray[temp] = item;
        }

    }

    @Override
    public char dequeue() {
        if (isEmpty()) {
            char result = itemArray[front];
            front = (front + 1) % size;
            return result;
        } else {
            return 0;
        }
    }

    @Override
    public void delete() {
        if (!isEmpty())
            front = (front + 1) % size;
    }

    @Override
    public char peek() {
        return !isEmpty() ? itemArray[front] : 0;
    }
}
