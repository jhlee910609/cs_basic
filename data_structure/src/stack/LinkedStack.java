package stack;

public class LinkedStack implements Stack {

    private StackNode top;

    public LinkedStack() {
        this.top = null;
    }

    @Override
    public void push(char item) {
        StackNode newNode = new StackNode(item);
        newNode.link = top;
        top = newNode;
    }

    @Override
    public char pop() {
        if (isEmpty()) {
            return 0;
        } else {
            char temp = top.data;
            top = top.link;
            return temp;
        }
    }

    @Override
    public boolean isEmpty() {
        return top == null;
    }


    @Override
    public void delete() {
        if (isEmpty()) {

        } else {
            top = top.link;
        }

    }

    @Override
    public char peek() {
        return top.data;
    }

    private class StackNode {
        char data;
        StackNode link;

        StackNode(char data) {
            this.data = data;
        }
    }
}
