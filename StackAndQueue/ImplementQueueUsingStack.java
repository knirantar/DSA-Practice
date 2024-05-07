package StackAndQueue;

public class ImplementQueueUsingStack {
    Stack inp = new Stack();
    Stack out = new Stack();

    public void push(int x) {
        inp.push(x);
    }

    public int top() {
        if (out.isEmpty()) {
            while (!inp.isEmpty()) {
                out.push(inp.pop());
            }
            return out.top();
        } else {
            return out.top();
        }

    }

    public int pop() {
        if (out.isEmpty()) {
            while (!inp.isEmpty()) {
                out.push(inp.pop());
            }
            return out.pop();
        } else {
            return out.pop();
        }

    }

    public static void main(String[] args) {

        ImplementQueueUsingStack iq = new ImplementQueueUsingStack();
        iq.push(10);
        iq.push(20);
        iq.push(30);
        iq.push(40);
        System.out.println(iq.pop());
        System.out.println(iq.top());

    }

}
