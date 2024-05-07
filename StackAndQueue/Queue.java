package StackAndQueue;

public class Queue {
    int front = 0;
    int rear = 0;
    int count = 0;
    int[] arr = new int[5];

    public void push(int x) {
        if (count < arr.length) {
            count++;
            rear = rear % arr.length;
            arr[rear++] = x;
        } else {
            System.out.println("Queue is full cannot be pushed");
        }
    }

    public int top() {
        return arr[front % arr.length];
    }

    public int pop() {
        int popElement = arr[front % arr.length];
        front++;
        count--;
        return popElement;
    }

    public int size() {
        return (rear - front);
    }

    public Boolean isEmpty() {
        if (count == 0)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.push(10);
        q.push(20);
        q.push(30);
        q.push(40);
        q.push(50);
        // q.push(60);
        System.out.println(q.top());
        q.pop();
        System.out.println(q.top());
        q.push(100);
        System.out.println(q.pop());
        System.out.println(q.pop());
        System.out.println(q.pop());
        System.out.println(q.pop());
        System.out.println(q.pop());
    }

}
