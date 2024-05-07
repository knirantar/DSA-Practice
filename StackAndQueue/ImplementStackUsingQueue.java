package StackAndQueue;

import java.util.LinkedList;
import java.util.Queue;

public class ImplementStackUsingQueue {
    Queue<Integer> q = new LinkedList<>();

    public void push(int x) {
        q.offer(x);
        for (int i = 0; i < q.size() - 1; i++) {
            q.offer(q.poll());
        }
    }

    public int top() {
        return q.peek();
    }

    public int pop() {
        return q.poll();
    }

    public static void main(String[] args) {
        ImplementStackUsingQueue is = new ImplementStackUsingQueue();
        is.push(10);
        is.push(20);
        is.push(30);
        System.out.println(is.pop());

    }

}
