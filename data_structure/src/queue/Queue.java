package queue;

public interface Queue {

    boolean isEmpty();

    void enqueue(char item);

    char dequeue();

    void delete();

    char peek();
}
