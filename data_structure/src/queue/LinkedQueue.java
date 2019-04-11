package queue;

public class LinkedQueue implements Queue {

    private QueueNode front, rear;

    public LinkedQueue() {
        this.front = null;
        this.rear = null;
    }

    @Override
    public boolean isEmpty() {
        return front == null;
    }

    @Override
    public void enqueue(char item) {
        QueueNode newNode = new QueueNode(item);
        if (isEmpty()) {
            front = newNode;
            rear = newNode;
        } else {
            rear.link = newNode;
            rear = newNode;
        }
    }

    @Override
    public char dequeue() {
        char result = 0;
        if (!isEmpty()) {
            result = front.data;
            front = front.link;
        }

        return result;
    }

    @Override
    public void delete() {
        if (!isEmpty())
            front = front.link;
    }

    @Override
    public char peek() {
        return isEmpty() ? 0 : front.data;
    }


    private class QueueNode {

        char data;
        QueueNode link;

        public QueueNode(char data) {
            this.data = data;
            this.link = null;
        }
    }
}
