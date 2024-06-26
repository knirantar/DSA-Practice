package Array;

import StackAndQueue.Stack;

public class PreviousSmallerElement {
    public static void main(String[] args) {
        int a[] = new int[] { 4, 2, 1, 5, 6, 3, 2, 4, 2 };
        int[] b = prevSmaller(a);
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
        int[] c = nextSmaller(a);
        System.out.println();
        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i]);
        }
    }

    private static int[] nextSmaller(int[] a) {
        Stack s = new Stack();
        int[] c = new int[a.length];
        for (int i = a.length - 1; i >= 0; i--) {
            if (s.isEmpty()) {
                c[i] = -1;

            } else {
                while (!s.isEmpty() && a[i] <= s.top()) {
                    s.pop();
                }
                if (!s.isEmpty()) {
                    c[i] = s.top();
                } else {
                    c[i] = -1;
                }
            }
            s.push(a[i]);
        }
        return c;
    }

    private static int[] prevSmaller(int[] a) {
        Stack s = new Stack();
        int[] b = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            if (s.isEmpty()) {
                b[i] = -1;
            } else {
                while (!s.isEmpty() && s.top() >= a[i]) {
                    s.pop();
                }
                if (!s.isEmpty()) {
                    b[i] = s.top();
                } else {
                    b[i] = -1;
                }
            }
            s.push(a[i]);
        }
        return b;
    }

}
