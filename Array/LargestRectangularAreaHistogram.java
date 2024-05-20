package Array;

import java.util.Stack;

public class LargestRectangularAreaHistogram {
    public static void main(String[] args) {
        int a[] = new int[] { 4, 2, 1, 5, 6, 3, 2, 4, 2 };
        System.out.println(findLargestRectangleArea(a)); // Expected output: 8
    }

    private static int[] nextSmaller(int[] a) {
        int n = a.length;
        int[] c = new int[n];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            c[i] = n;
        }
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && a[stack.peek()] >= a[i]) {
                stack.pop();
            }
            if (!stack.isEmpty()) {
                c[i] = stack.peek();
            }
            stack.push(i);
        }
        return c;
    }

    private static int[] prevSmaller(int[] a) {
        int n = a.length;
        int[] b = new int[n];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            b[i] = -1;
        }
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && a[stack.peek()] >= a[i]) {
                stack.pop();
            }
            if (!stack.isEmpty()) {
                b[i] = stack.peek();
            }
            stack.push(i);
        }
        return b;
    }

    private static int findLargestRectangleArea(int[] a) {
        int n = a.length;
        int[] ps = prevSmaller(a);
        int[] ns = nextSmaller(a);
        int maxArea = 0;

        for (int i = 0; i < n; i++) {
            int width = ns[i] - ps[i] - 1;
            int area = width * a[i];
            maxArea = Math.max(maxArea, area);
        }
        return maxArea;
    }
}
