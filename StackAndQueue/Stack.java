package StackAndQueue;

public class Stack {
    int[] arr = new int[10];
    int top = -1;

    public void push(int x) {
        arr[++top] = x;
    }

    public int top() {
        int retTop = arr[top];
        return retTop;
    }

    public int pop() {
        int retTop = arr[top];
        top--;
        return retTop;
    }

    public int size() {
        return top + 1;
    }

    public Boolean isEmpty() {
        if (top == -1)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.pop();
        s.pop();
        System.out.println(s.top());
        // for (int i = 0; i < s.arr.length; i++) {
        // System.out.println(s.arr[i]);
        // }

    }

}
