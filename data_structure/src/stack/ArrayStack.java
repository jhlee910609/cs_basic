package stack;

public class ArrayStack implements Stack {

    private int top;
    private int stackSize;
    private char itemArray[];

    public ArrayStack(int stackSize) {
        this.stackSize = stackSize;
        itemArray = new char[stackSize];
        top = -1;
    }

    @Override
    public void push(char item) {
        if (isFull()) {
            System.out.print("Full!");
        } else {
            itemArray[++top] = item;
        }
    }

    @Override
    public char pop() {
        return isEmpty() ? 0 : itemArray[top--];
    }

    @Override
    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == stackSize - 1;
    }

    @Override
    public void delete() {
        if (isEmpty()) {
            System.out.print("There is no element!");
        } else {
            top--;
        }
    }

    @Override
    public char peek() {
        return isEmpty() ? 0 : itemArray[top];
    }
}
